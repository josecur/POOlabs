
package Cliente;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class Clientes2023 {
    private static ArrayList<Cliente> clientes;
    
    public Clientes2023() {
    clientes = new ArrayList<>();
    cargarArchivo();
    }
    
    public void adicionar(Cliente cliente) {
        clientes.add(cliente);
    }
    
    public void eliminar(Cliente cliente) {
        clientes.remove(cliente);
    }
    
    //
    
    private void readFromInputStream(InputStream inputStream) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String linea;
        
        while ((linea = br.readLine()) != null) {
         StringTokenizer st = new StringTokenizer(linea, ",");
            createClient(st);
        } 
        br.close();
    }
    
    // M?todo que a?adir a los estudiantes del archivo .txt en el arrayList estudiantes.
    private void createClient(StringTokenizer st){
        String nombre = st.nextToken().trim();
        String apellido = st.nextToken().trim();
        String contraseña = st.nextToken().trim();
        String email = st.nextToken().trim();
        Cliente cliente = new Cliente(nombre,apellido,contraseña,email);
        adicionar(cliente);
    }
    
    // M?todos para manipular el archivo de texto
    private void cargarArchivo() {
    try {
        File file = new File("./src/LisClientesRegistrados.txt");
        Class<Clientes2023> clazz = Clientes2023.class;
        InputStream inputStream = clazz.getResourceAsStream("/LisClientesRegistrados.txt");
        if (file.exists()) {
            readFromInputStream(inputStream);
        } else
            JOptionPane.showMessageDialog(null,"El archivo txt no existe");
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "Se produjo un error= " + x);
        }
    }
}
