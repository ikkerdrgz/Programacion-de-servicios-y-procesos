/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sincronizacion;

/**
 *
 * @author FP
 */
public class EntraJardin extends Thread{
    private RecursoJardin jardin;

    public EntraJardin(String nombre, RecursoJardin j) {
        this.setName(nombre);
        this.jardin = j;
    }
    
    @Override
    public void run() {
        jardin.incrementaCuenta();
    }
}
