/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4enc13a18;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Rectangulo {

    Scanner leer = new Scanner(System.in);
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void Crear() {
        System.out.println("Ingrese la base");
        this.base = leer.nextDouble();
        System.out.println("Ingrese la altura");
        this.altura = leer.nextDouble();
    }

    public double Area() {
        double area = this.base * this.altura;
        return area;
    }

    public double Perimetro() {
        double perimetro = 2 * (this.base + this.altura);
        return perimetro;
    }
    
    public void Mostrar(){
        for(int i=1;i<=this.altura;i++){
            for(int j=1;j<=this.base;j++){
                if(i==1 || i==(this.altura) || j==1 || j==(this.base)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
