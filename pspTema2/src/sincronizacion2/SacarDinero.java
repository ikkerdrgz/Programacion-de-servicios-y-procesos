/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sincronizacion2;

/**
 *
 * @author FP
 */
public class SacarDinero extends Thread{
        private Cuenta c;
    public SacarDinero (String n, Cuenta c){
        super(n);
        this.c = c;
    }
    public void run() {
        for (int i = 1; i <= 4; i++) {
            c.RetirarDinero(10,getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) { }; 
        }
    }
}
