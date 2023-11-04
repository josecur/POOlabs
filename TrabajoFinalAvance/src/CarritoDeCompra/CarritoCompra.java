
package CarritoDeCompra;

import Producto.Producto;
import java.util.ArrayList;

public class CarritoCompra {
    private static ArrayList<Producto> carritoproductos;
    
    public void adicionar(Producto producto) {
        carritoproductos.add(producto);
    }
    
    public void eliminar(Producto producto) {
        carritoproductos.remove(producto);
    }
    
    
    
    
    //Suma de precios en el carro
    public double calcularPrecios(){
        double sum = 0;
        
        
        
        
        
    }
    
    
    
}
