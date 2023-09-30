
import FigurasGeometricas.Cuadrilatero;
import FigurasGeometricas.Punto;

public class NewClass {
    
    public static void main(String[] args) {
        Punto vertice1 = new Punto(3,2);
        Punto vertice2 = new Punto(3,0);
        Punto vertice3 = new Punto(0,0);
        Punto vertice4 = new Punto(0,3);
        
        Cuadrilatero cuadrilatero1 = new Cuadrilatero(vertice1,vertice2,vertice3,vertice4);
        
        System.out.println(cuadrilatero1.getDistanciaEntrePuntos());
        
        
        
    }
}
