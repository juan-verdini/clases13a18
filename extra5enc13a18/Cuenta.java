/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra5enc13a18;

import java.util.Scanner;

/**
 * Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego,
 * crea un método "retirar_dinero" que permita retirar una cantidad de dinero
 * del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después
 * de realizar una transacción de retiro.
 *
 * /**
 *
 * @author PC
 */
public class Cuenta {

    public double saldo;
    public String titular;

    Scanner leer = new Scanner(System.in);

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public Cuenta() {
        saldo = 10000;
        titular = "Juan";
    }

    public void retirar_dinero() {
        double monto;
        int opc = 1;
        while (opc == 1 && saldo > 0) {
            System.out.println("Hola " + titular + ", cuánto dinero desea retirar?");
            System.out.println("Su saldo es de $" + saldo);
            monto = leer.nextDouble();
            while (monto > saldo) {
                System.out.println("No tiene suficiente saldo para retirar, ingrese un nuevo monto");
                monto = leer.nextDouble();
            }
            saldo = saldo - monto;
            System.out.println("Usted ha retirado $" + monto + ", su saldo restante es de $" + saldo);
            if (saldo > 0) {
                System.out.println("Desea retirar más dinero? 1 para si, 2 para no");
                opc = leer.nextInt();
            }
        }
    }
}
