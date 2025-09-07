/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios0609;

import java.util.Scanner;

/**
 *
 * @author mvefr
 */
public class EJERCICIOS0609 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner lector = new Scanner(System.in);
        int i;
        int[] numero = new int[5];

        System.out.println("Ingrese 5 números:");
        for (i = 0; i < 5; i++) {
            numero[i] = lector.nextInt();
        }

        System.out.println("Los números ingresados son los siguientes:");
        for (i = 0; i < 5; i++) {
            System.out.println(numero[i]);
        }
    }
    
}
