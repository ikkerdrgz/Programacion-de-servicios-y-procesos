/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package executorService;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        //Preparar una coleccion de objetos callable
        //Que harán cada uno una cosa
        Set<Callable<String>> callables = new HashSet<Callable<String>>();
        //Añado los objetos a la cola
        //Cada uno con su operación
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Tarea 1";
            }
        });
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Tarea 2";
            }
        });
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Tarea 3";
            }
        });
        //Declaramos la lista de objetos Future
        //y utilizo el método de llamar a todos
        java.util.List<Future<String>> futures = executorService.invokeAll(callables);
        
        for (Future<String> future : futures) {
            System.out.println("futures.get = " + future.get());
        }
        //Hay que terminar el proceso
        executorService.shutdown();
    }
}
