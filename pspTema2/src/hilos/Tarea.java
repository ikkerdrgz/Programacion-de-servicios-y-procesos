/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos;

/**
 *
 * @author FP
 */
public class Tarea extends Thread {
    @Override
    public void run(){
        for (int i = 1; i <= 10; i++){
            System.out.println("Soy el hilo numero " + i + " y esto es lo que hago");
        }
    }    
}


