/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vacunacion;

/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) {
        ListaPaciente lista1 = new ListaPaciente("pm1", new int[] {3, 6, 10, 1, 5});
        ListaPaciente lista2 = new ListaPaciente("pm2", new int[] {7, 2, 1, 10, 4});
        
        //Enfermero enf1 = new Enfermero("Valentino");
        //Enfermero enf2 = new Enfermero("Mark");
        long inicio = System.currentTimeMillis();
        
        Enfermero2 enf1 = new Enfermero2("Valentino", lista1, inicio);
        Enfermero2 enf2 = new Enfermero2("Mark", lista2, inicio);
        
        //enf1.vacunar(lista1, inicio);
        //enf2.vacunar(lista2, inicio);
        enf1.start();
        enf2.start();
    }
}
