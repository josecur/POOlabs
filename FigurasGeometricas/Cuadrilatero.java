/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FigurasGeometricas;

public class Cuadrilatero {
    private final Punto vertice1;
    private final Punto vertice2;
    private final Punto vertice3;
    private final Punto vertice4;

    public Cuadrilatero(Punto vertice1, Punto vertice2, Punto vertice3, Punto vertice4) {
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
        this.vertice4 = vertice4;
    }
    
    public double getDistanciaEntrePuntos() {
       
        double Distancia1 = Math.sqrt(Math.pow((vertice2.getCoordenadaX()- vertice1.getCoordenadaX()),2) + Math.pow((vertice2.getCoordenadaY()- vertice1.getCoordenadaY()),2));
        double Distancia2 = Math.sqrt(Math.pow((vertice3.getCoordenadaX()- vertice2.getCoordenadaX()),2) + Math.pow((vertice3.getCoordenadaY()- vertice2.getCoordenadaY()),2));
        double Distancia3 = Math.sqrt(Math.pow((vertice4.getCoordenadaX()- vertice3.getCoordenadaX()),2) + Math.pow((vertice4.getCoordenadaY()- vertice3.getCoordenadaY()),2));
        double Distancia4 = Math.sqrt(Math.pow((vertice1.getCoordenadaX()- vertice4.getCoordenadaX()),2) + Math.pow((vertice1.getCoordenadaY()- vertice4.getCoordenadaY()),2));
        
        return (int)Distancia4;
    }
    
}
