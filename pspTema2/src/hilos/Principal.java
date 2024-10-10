/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hilos;

/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) {
        Tarea tarea = new Tarea();
        Tarea2 tarea2 = new Tarea2();
        tarea.start();
        try {
            tarea.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        tarea2.start();
        try {
            tarea2.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("Yo soy el hilo principal y sigo currando");
        System.out.println("Fin del hilo principal");
    }
}
