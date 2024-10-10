/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sumatorioConProcesadores;
import java.util.concurrent.*;
/**
 *
 * @author FP
 */
public class Suma implements Callable<Long>{
    private long n1;
    private long n2;
    
    Suma() {
        this.n1 = 0;
        this.n2 = 0;
    }
    
    Suma(long n1, long n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    
    @Override
    public Long call() {
        long result = 0;
        
        try {
            Thread hiloActual = Thread.currentThread();
            System.out.println("Iniciando el hilo " + hiloActual.getName() + ": Suma (" + this.n1 + ","  + this.n2 + ")");
            for (long y = this.n1; y <= this.n2; y++) {
                result = result + y;
            }
            Thread.sleep(500);
            System.out.println("Finalizado el hilo " + hiloActual.getName());
            System.out.println("Resultado del hilo: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
