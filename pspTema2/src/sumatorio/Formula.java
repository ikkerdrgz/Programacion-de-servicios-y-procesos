/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sumatorio;

/**
 *
 * @author FP
 */
public class Formula extends Thread {
    private double numero;
    
    public Formula(double n) {
        this.numero = n;
    }
    
    public void run() {
        double suma = 0.0;
        for (double i = numero; i >= 1; i--) {
            suma += i;
        }
    }
}
