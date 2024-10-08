/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz;

import java.util.Scanner;

/**
 *
 * @author 57314
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // quiz java punto 2
         Scanner sc=new Scanner (System.in);
        //variable tipo vector 
        float[]alturas;
        alturas = new float [5]; 
        for(int i=0;i<5;i++){
            System.out.println("ingrese la altura de la persona");
            alturas[i]=sc.nextFloat();
        }
         //calcular promedio
         float suma=0, promedio=0;
         for(int j=0;j<5;j++){
             suma=suma+alturas[j];
         }
        
         
         promedio=suma/5;
         System.out.println("promedio de alturas " +promedio );
         //contar los mayores y menores 
         int may,men;
         may=0;
         men=0;
         for(int j=0;j<5;j++){
             if (alturas[j]>promedio){
                 may++;
             }else if (alturas [j]<promedio){
                 men++;
             }
         }
         System.out.println("la cantidad de altura  mayor del promedio es :"+may );
         System.out.println("la cantidad menor  de la altura del promedio es"+men);
        
        
        
        
    }
    
}
