/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego.pkg3;
public class Elfo extends Personaje {
    private String reino;

    public Elfo(String nombre, String raza, String arma, int vida, int daño, int bonificacion, String reino) {
        super(nombre, raza, arma, vida, daño, bonificacion);
        this.reino = reino;
    }

    public String getReino() {
        return this.reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

    public void historia() {
        System.out.println("El alto e imponente elfo llamado"+getNombre()+"fue imbocado a pelear");
    }

    public void victoria() {
        System.out.println("el elfo se also con la victoria");;
    }

    public void derrota() {
        historia();
    }

    public void quitaVida() {
        int vidaActual = this.getVida();
        int vidaNueva = (int)((double)vidaActual * 0.9);
        this.setVida(vidaNueva);
    }
}

