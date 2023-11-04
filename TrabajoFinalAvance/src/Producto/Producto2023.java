
package Producto;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class Producto2023 {
    private static ArrayList<Producto> productos;
    
    public Producto2023() {
    productos = new ArrayList<>();
    cargarArchivo();
    }
    
    public void adicionar(Producto producto) {
        productos.add(producto);
    }
    
    public void eliminar(Producto producto) {
        productos.remove(producto);
    }
    
    //
    
    private void readFromInputStream(InputStream inputStream) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String linea;
        
        while ((linea = br.readLine()) != null) {
         StringTokenizer st = new StringTokenizer(linea, ",");
            createProduct(st);
        } 
        br.close();
    }
    
    // M?todo que a?adir a los estudiantes del archivo .txt en el arrayList estudiantes.
    private void createProduct(StringTokenizer st){
        int cantidad = Integer.parseInt(st.nextToken().trim());
        String nombre = st.nextToken().trim();
        String descripcion = st.nextToken().trim();
        double precio = Double.parseDouble(st.nextToken().trim());
        Producto producto = new Producto(nombre,precio,cantidad,descripcion);
        adicionar(producto);
    }
    
    // M?todos para manipular el archivo de texto
    private void cargarArchivo() {
    try {
        File file = new File("./src/ListProductos.txt");
        Class<Producto2023> clazz = Producto2023.class;
        InputStream inputStream = clazz.getResourceAsStream("/ListProductos.txt");
        if (file.exists()) {
            readFromInputStream(inputStream);
        } else
            JOptionPane.showMessageDialog(null,"El archivo txt no existe");
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "Se produjo un error= " + x);
        }
    }
}
