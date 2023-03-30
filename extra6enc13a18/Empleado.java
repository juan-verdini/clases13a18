/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra6enc13a18;

import java.util.Scanner;

/**
 * Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
 * "salario". Luego, crea un método "calcular_aumento" que calcule el aumento
 * salarial de un empleado en función de su edad y salario actual. El aumento
 * salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si
 * tiene menos de 30 años. /**
 *
 * @author PC
 */
public class Empleado {
Scanner leer = new Scanner(System.in);
public String nombre;
public int edad;
public double salario;

    public Empleado() {
    }
    

public void calcular_aumento(){
    System.out.println("Ingrese el nombre del empleado");
    nombre = leer.next();
    System.out.println("Ingrese la edad del empleado " + nombre);
    edad = leer.nextInt();
    System.out.println("Ahroa ingrese su salario");
    salario = leer.nextInt();
    if(edad>=30){
        salario = salario*1.1;
    }else{
        salario = salario*1.05;
    }
    System.out.println("El salario del empleado " + nombre + " es de $" + salario);
}
}
