
import Cliente.ClientesActuales;
import Producto.ProductosActuales;
import javax.swing.*;


public class InterfazDeCompras {
    public static void main(String[] args) {
        
        ClientesActuales clientes = new ClientesActuales();
        ProductosActuales productos = new ProductosActuales();
        
        JFrame frame = new JFrame("Dorita");
        
        JButton jbtOK = new JButton("OK");
        jbtOK.setSize(100, 100);
        frame.add(jbtOK);
        
        
	frame.setSize(400, 300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.setLocationRelativeTo(null);
        
        
                 
                 
        
        
        
        
        
        
        
        
    }    
}
