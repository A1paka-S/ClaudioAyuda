/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego.pkg3;


public class Enano extends Personaje {
    private String clan;

    public Enano(String nombre, String raza, String arma, int vida, int daño, int bonificacion, String clan) {
        super(nombre, raza, arma, vida, daño, bonificacion);
        this.clan = clan;
    }

    public String getClan() {
        return this.clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }

    public void historia() {
        System.out.println("El pequeño pero temble enano"+getNombre()+"fue imbocado a pelear");
    }

    public void victoria() {
        System.out.println("El enano "+getNombre()+" ganó");
    }

    public void derrota() {
        System.out.println("El enano perdio");
    }

    public void heal(int extra_va) {
        this.setVida(this.getVida() + extra_va);
    }
}
