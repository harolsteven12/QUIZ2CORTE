/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizjava;

import java.util.Scanner;

/**
 *
 * @author 57314
 */
public class Quizjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];
        int sumaPares = 0;
        int sumaImpares = 0; 
        int sumaPosPares = 0;
        int sumaPosImpares = 0;
        int countPares = 0;
        int countImpares = 0;

        
        System.out.println("Ingrese 20 números enteros:");
        for (int i = 0; i < 20; i++) {
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 == 0) {
                sumaPares += numeros[i];
                countPares++;
            } else {
                sumaImpares += numeros[i];
                countImpares++;
            }
            if (i % 2 == 0) {
                sumaPosImpares += numeros[i]; 
            } else {
                sumaPosPares += numeros[i]; 
            }
        }

        // Calcular promedios
        double promedioPares = (countPares > 0) ? (double) sumaPares / countPares : 0;
        double promedioImpares = (countImpares > 0) ? (double) sumaImpares / countImpares : 0;

        // Mostrar resultados
        System.out.println("el promedio de numeros pares es: " + promedioPares);
        System.out.println("el Promedio de números impares es: " + promedioImpares);
        System.out.println("la suma de elemntos pares es: " + sumaPosPares);
        System.out.println("la suma de elementos impares es: " + sumaPosImpares);
    }
}
    
