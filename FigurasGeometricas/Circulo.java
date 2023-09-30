/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FigurasGeometricas;



/**
 *
 * @author Alumno
 */
public class Circulo {
    private int radio;
    private Punto centro;

    public Circulo (int radio, Punto centro) {
        this.radio = radio;
        this.centro = centro;
    }


    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }
    
    public double getArea () {
        return Math.PI*Math.pow(radio, 2);
    }
    
    public double getPerimetro () {
        return 2*Math.PI*radio;
    }
}
