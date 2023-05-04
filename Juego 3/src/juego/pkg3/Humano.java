/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego.pkg3;

import java.util.Scanner;
public class Humano extends Personaje {
    private String casta;
    private int bono;
    private boolean bonoActivo;

    public Humano(String nombre, String raza, String arma, int vida, int daño, int bonificacion, String casta) {
        super(nombre, raza, arma, vida, daño, bonificacion);
        this.casta = casta;
        this.bono = 0;
        this.bonoActivo = false;
    }

    public String getCasta() {
        return this.casta;
    }

    public String setCasta() {
        return casta;
    }

    public void historia() {
        System.out.println("El noble pero misterioso humano"+getNombre()+"fue imbocado a pelear");
    }

    public void victoria() {
        System.out.println("Ha ganado el humano "+getNombre());
    }

    public void derrota() {
        Scanner sc= new Scanner(System.in);
        System.out.println("El humano ha perdido");
        System.out.println("Actualice su arma: ");
        String armanueva = sc.next();
        setArma(armanueva);
    }
    
    public void superBono(int extra_ad) {
        this.setVida(this.getVida() + extra_ad);
    }

}
