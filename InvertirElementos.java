/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication15;
import java.util.Scanner;
import java.util.Arrays;

public class InvertirElementos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];

        System.out.println("Ingrese 6 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int inicio = 0;
        int fin = numeros.length - 1;
        while (inicio < fin) {
           
            int temp = numeros[inicio];
            numeros[inicio] = numeros[fin];
            numeros[fin] = temp;

            
            inicio++;
            fin--;
        }

        
        System.out.println("Array invertido: " + Arrays.toString(numeros));

        scanner.close();
    }
}

/**
 *
 * @author compu
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
