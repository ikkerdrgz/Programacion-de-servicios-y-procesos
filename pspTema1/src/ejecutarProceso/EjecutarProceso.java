/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutarProceso;

/**
 *
 * @author FP
 */
public class EjecutarProceso {
    public void ejecutar(String ruta){
        ProcessBuilder pb;
        try {
            pb = new ProcessBuilder(ruta);
            pb.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        String ruta1 = "\"C:\\Program Files\\Microsoft Office\\root\\Office16\\POWERPNT.EXE\"";
        String ruta2 = "\"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe\"";
        EjecutarProceso lp = new EjecutarProceso();
        lp.ejecutar(ruta1);
        lp.ejecutar(ruta2);
        System.out.println("Finalizado");
    }
}
