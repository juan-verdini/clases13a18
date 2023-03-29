/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra3enc13a18;

import java.util.Scanner;

/**
 * Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos
 * jugadores jugar un juego de adivinanza de números. El primer jugador elige un
 * número y el segundo jugador intenta adivinarlo. El segundo jugador tiene un
 * número limitado de intentos y recibe una pista de "más alto" o "más bajo"
 * después de cada intento. El juego termina cuando el segundo jugador adivina
 * el número o se queda sin intentos. Registra el número de intentos necesarios
 * para adivinar el número y el número de veces que cada jugador ha ganado.
 *
 * /**
 *
 * @author USUARIO
 */
public class Juego {

    Scanner leer = new Scanner(System.in);
    public int numero;

    public Juego() {
    }

    public void iniciar_juego() {
        int intentos = 1;
        int num;
        int j1 = 0, j2 = 0, opc = 1;
        while (opc != 2) {
            System.out.println("JUGADOR 1");
            System.out.println("Ingrese la cantidad de intentos que le dará al jugador 2");
            int limite = leer.nextInt();
            System.out.println("Ahora ingrese el número que debe adivinar el jugador 2, debe ser entre 1 y 20");
            this.numero = leer.nextInt();
            while (this.numero < 1 || this.numero > 20) {
                System.out.println("El número no está entre 1 y 20, ingrese otro");
                this.numero = leer.nextInt();
            }
            System.out.println("------------------");
            System.out.println("JUGADOR 2");
            do {
                System.out.println("Intento " + intentos + " de " + limite);
                num = leer.nextInt();
                if (num != this.numero) {
                    if (num > this.numero) {
                        System.out.println("Más bajo");
                    } else if (num < this.numero) {
                        System.out.println("Más alto");
                    }
                    intentos++;
                } else {
                    System.out.println("El número es el correcto! Felicitaciones Lunita");
                    System.out.println("Te ha tomado " + intentos + " intentos adivinar el número");
                    j2++;
                }
            } while (num != this.numero && intentos <= limite);
            if (intentos - 1 == limite) {
                System.out.println("Se te agotaron los intentos :(");
                j1++;
            }
            System.out.println("Juancito ha ganado " + j1 + " veces");
            System.out.println("Lunita ha ganado " + j2 + " veces");
            intentos = 1;
            System.out.println("Deseas seguir jugando? 1 para si, 2 para no");
            opc = leer.nextInt();
        }
    }
}
