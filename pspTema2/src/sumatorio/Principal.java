/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sumatorio;

/**
 *
 * @author FP
 */
public class Principal {
    static double sumatorioCompartido;
    public static void main(String[] args) {
        Formula sumatorio1 = new Formula(5);
        Formula sumatorio2 = new Formula(8);
        Formula sumatorio3 = new Formula(20);
        double total = 0;
        //total = (sumatorio(5) + sumatorio(8) + sumatorio(20)) / (3*sumatorio(5));
        System.out.println("Formula = " + total);
    }
}
