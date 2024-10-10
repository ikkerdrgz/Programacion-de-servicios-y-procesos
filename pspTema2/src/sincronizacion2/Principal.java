/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sincronizacion2;

/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) {
        Cuenta c = new Cuenta(40);
        SacarDinero h1 = new SacarDinero("Pantoja",c);
        SacarDinero h2 = new SacarDinero("Paquirrin",c);
        h1.start();
        h2.start();
    }
}
