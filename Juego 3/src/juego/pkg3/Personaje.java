/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego.pkg3;


public abstract class Personaje {
    private String nombre;
    private String raza;
    private String arma;
    private int vida;
    private int daño;
    private int bonificacion;

    public Personaje(String nombre, String raza, String arma, int vida, int daño, int bonificacion) {
        this.nombre = nombre;
        this.raza = raza;
        this.arma = arma;
        this.vida = vida;
        this.daño = daño;
        this.bonificacion = bonificacion;
    }

    public static void combate(Personaje p1, Personaje p2) {
        for (int i = 0; i < 10; i++) {
            // p1 ataca a p2

            int dañoP1 = p1.getDaño();
            int vidap2 = p2.getVida();
            int dañotemporalp2 = vidap2-dañoP1;
            p2.setVida(dañotemporalp2);

            System.out.println("Inicio de la ronda " + (i+1));
            System.out.println("p1: " + p1.getVida());
            System.out.println("p2: " + p2.getVida());

            if (p2.getVida() <= 0) {
                System.out.println("p2 ha perdido");

                p1.victoria();
                p2.derrota();
                return;
            }
            // p2 ataca a p1
            int dañoP2 = p2.getDaño();
            int vidap1 = p1.getVida();
            int danotemporalp1 = vidap1-dañoP2;
            p1.setVida(danotemporalp1);
            if (p1.getVida() <= 0) {
                System.out.println("p1 ha perdido");
                p2.victoria();
                p1.derrota();
                return;
            }
        }
        // Si no hay ganador después de las 10 rondas, el objeto con más vida gana
        if (p1.getVida() > p2.getVida()) {
            System.out.println("por tiempo e ganador es p1");
            p1.victoria();
            p2.derrota();
        } else if (p2.getVida() > p1.getVida()) {
            System.out.println("por tiempo ganador es p2");
            p2.victoria();
            p1.derrota();
        } else {
            System.out.println("Empate");
        }
    }
    public abstract void victoria();

    public abstract void derrota();

    public abstract void historia();


    public String getNombre() {
        return this.nombre;
    }

    public String getRaza() {
        return this.raza;
    }

    public String getArma() {
        return this.arma;
    }

    public int getVida() {
        return this.vida;
    }

    public int getDaño() {
        return this.daño;
    }

    public int getBonificacion() {
        return this.bonificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public void setBonificacion(int bonificacion) {
        this.bonificacion = bonificacion;
    }

}