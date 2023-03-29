/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra2enc13a18;

import java.util.Scanner;

/**Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus atributos serán, x1, y1, x2, y2,
 *siendo cada x e y un punto. Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números
 *y los ingresa en los atributos del objeto. Después, a través de otro método calcular y devolver la distancia que existe entre
 *los dos puntos que existen en la clase Puntos.
/**
 *
 * @author USUARIO
 */
public class Puntos {
    Scanner leer = new Scanner(System.in);
    public int x1;
    public int x2;
    public int y1;
    public int y2;

    public Puntos() {
    }
    
    public void crearPuntos(){
        System.out.println("Ingrese la coordenada x del primer punto");
        this.x1 = leer.nextInt();
        System.out.println("Ingrese la coordenada y del primer punto");
        this.y1 = leer.nextInt();
        System.out.println("Ingrese la coordenada x del segundo punto");
        this.x2 = leer.nextInt();
        System.out.println("Ingrese la coordenada y del segundo punto");
        this.y2 = leer.nextInt();
    }
    public double calcular(){
        double distancia;
        distancia = Math.sqrt(((this.x2-this.x1)*(this.x2-this.x1))+((this.y2-this.y1)*(this.y2-this.y1)));
        return distancia;
    }

    @Override
    public String toString() {
        return "Puntos{" + "x1=" + x1 + ", x2=" + x2 + ", y1=" + y1 + ", y2=" + y2 + '}';
    }
    
}
