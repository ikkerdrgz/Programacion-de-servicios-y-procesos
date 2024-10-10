/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sincronizacion;

/**
 *
 * @author FP
 */
public class RecursoJardin {
    private int cuenta;
    
    public RecursoJardin() {
        cuenta = 100;
    }
    
    public synchronized void incrementaCuenta() {
        System.out.println("hilo " + Thread.currentThread().getName() + " ----- Entra en Jardin");
        cuenta++;
        System.out.println(cuenta + " en Jardin");
    }
    
    public synchronized void decrementaCuenta() {
        System.out.println("hilo " + Thread.currentThread().getName() + " ----- Sale de Jardin");
        cuenta--;
        System.out.println(cuenta + " en Jardin");
    }
}
