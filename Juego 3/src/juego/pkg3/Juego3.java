/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juego.pkg3;

import java.util.Scanner;
public class Juego3 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido");
        System.out.println("================================================================================================");
        System.out.print("Ingrese la raza ([1]Humano/[2]Elfo/[3]Enano): ");
        int opcion = sc.nextInt();
        Personaje personaje1 = null;
        switch (opcion) {
            case 1 -> {
                System.out.print("Cree al personaje 1...");
                System.out.print("Ingrese el nombre: ");
                String nombre1 = sc.next();
                System.out.print("Ingrese la casta: ");
                String casta = sc.next();
                System.out.print("Ingrese el arma: ");
                String arma = sc.next();
                System.out.print("Ingrese la vida: ");
                int vida = sc.nextInt();
                System.out.print("Ingrese el daño: ");
                int daño = sc.nextInt();
                System.out.print("Ingrese la bonificación: ");
                int bono = sc.nextInt();
                System.out.println("Ingrese un bono entre 5 y 15: ");
                int ad = sc.nextInt();
                personaje1 =new Humano(nombre1, "humano", arma, vida, daño, bono, casta) ;
            } case 2 -> {
                System.out.print("Cree al personaje 1...");
                System.out.print("Ingrese el nombre: ");
                String nombre1 = sc.next();
                System.out.print("Ingrese el reino: ");
                String reino1 = sc.next();
                System.out.print("Ingrese el arma: ");
                String arma = sc.next();
                System.out.print("Ingrese la vida: ");
                int vida = sc.nextInt();
                System.out.print("Ingrese el daño: ");
                int daño = sc.nextInt();
                System.out.print("Ingrese la bonificación: ");
                int bono = sc.nextInt();
                personaje1 =new Elfo(nombre1, "humano", arma, vida, daño, bono, reino1);
            } case 3 -> {
                System.out.print("Cree al personaje 1...");
                System.out.print("Ingrese el nombre: ");
                String nombre1 = sc.next();
                System.out.print("Ingrese el clan: ");
                String clan1 = sc.next();
                System.out.print("Ingrese el arma: ");
                String arma = sc.next();
                System.out.print("Ingrese la vida: ");
                int vida = sc.nextInt();
                System.out.print("Ingrese el daño: ");
                int daño = sc.nextInt();
                System.out.print("Ingrese la bonificacion: ");
                int bono = sc.nextInt();
                personaje1 =new Enano(nombre1, "humano", arma, vida, daño, bono, clan1) ;
            } default -> {
                System.out.println("Raza inválida");
            }
        }

        System.out.print("Ingrese la raza ([1]Humano/[2]Elfo/[3]Enano): ");
        int raza2 = sc.nextInt();
        Personaje personaje2 = null;
        switch (raza2) {
            case 1 -> {
                System.out.print("Ingrese el nombre: ");
                String nombre2 = sc.next();
                System.out.print("Ingrese la casta: ");
                String casta2 = sc.next();
                System.out.print("Ingrese el arma: ");
                String arma2 = sc.next();
                System.out.print("Ingrese la vida: ");
                int vida2 = sc.nextInt();
                System.out.print("Ingrese el daño: ");
                int daño2 = sc.nextInt();
                System.out.print("Ingrese la bonificacion: ");
                int bono2 = sc.nextInt();
                personaje2 =new Humano(nombre2, "humano", arma2, vida2, daño2, bono2, casta2) ;
            } case 2 -> {
                System.out.print("Ingrese el nombre: ");
                String nombre2 = sc.next();
                System.out.print("Ingrese la casta: ");
                String reino2 = sc.next();
                System.out.print("Ingrese el arma: ");
                String arma2 = sc.next();
                System.out.print("Ingrese la vida: ");
                int vida2 = sc.nextInt();
                System.out.print("Ingrese el daño: ");
                int daño2 = sc.nextInt();
                System.out.print("Ingrese la bonificacion: ");
                int bono2 = sc.nextInt();
                personaje2 =new Elfo(nombre2, "humano", arma2, vida2, daño2, bono2, reino2) ;
            } case 3 -> {
                System.out.print("Ingrese el nombre: ");
                String nombre2 = sc.next();
                System.out.print("Ingrese la casta: ");
                String clan2 = sc.next();
                System.out.print("Ingrese el arma: ");
                String arma2 = sc.next();
                System.out.print("Ingrese la vida: ");
                int vida2 = sc.nextInt();
                System.out.print("Ingrese el daño: ");
                int daño2 = sc.nextInt();
                System.out.print("Ingrese la bonificacion: ");
                int bono2 = sc.nextInt();
                personaje2 =new Enano(nombre2, "humano", arma2, vida2, daño2, bono2, clan2) ; {
                };
            }
            default -> {
                System.out.print("Raza inválida");
            }
        }
        
        



        Personaje.combate(personaje1, personaje2);





    }
}
