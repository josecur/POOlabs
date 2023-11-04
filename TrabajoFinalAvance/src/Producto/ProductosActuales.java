
package Producto;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class ProductosActuales {
    private static ArrayList<Producto> productos;
    
    public ProductosActuales() {
    productos = new ArrayList<>();
    cargarArchivo();
    }
    
    public void adicionar(Producto producto) {
        productos.add(producto);
    }
    
    public void eliminar(Producto producto) {
        productos.remove(producto);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //----------------------Metodos para el txt-----------------------------------------
    
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
        String nombre = st.nextToken().trim();
        double precio = Double.parseDouble(st.nextToken().trim());
        int cantidad = Integer.parseInt(st.nextToken().trim());
        String descripcion = st.nextToken().trim();
        
        Producto producto = new Producto(nombre,precio,cantidad,descripcion);
        adicionar(producto);
    }
    
    // M?todos para manipular el archivo de texto
    private void cargarArchivo() {
    try {
        File file = new File("./src/ListProductos.txt");
        Class<ProductosActuales> clazz = ProductosActuales.class;
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
