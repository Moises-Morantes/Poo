/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejprop24;
    import java.util.Scanner;
public class EJPROP24 {

    public static void main(String[] args) {
        int indmayorpeso;
        ESFERA_class Esfera1 = new ESFERA_class();
        ESFERA_class Esfera2 = new ESFERA_class();
        ESFERA_class Esfera3 = new ESFERA_class();
        
        Scanner PESO1 = new Scanner(System.in);
        System.out.println("Ingrese el peso de la esfera 1: ");
        Esfera1.PESO = PESO1.nextFloat() ;
        
        Scanner PESO2 = new Scanner(System.in);
        System.out.println("Ingrese el peso de la esfera 2: ");
        Esfera2.PESO = PESO2.nextFloat() ;
        
        Scanner PESO3 = new Scanner(System.in);
        System.out.println("Ingrese el peso de la esfera 3: ");
        Esfera3.PESO = PESO3.nextFloat() ;
        
       String[] names = {"esfera 1", "esfera 2", "esfera 3"};
       double[] pesos = {Esfera1.PESO , Esfera2.PESO, Esfera3.PESO};
       
       indmayorpeso = 0;
      
       for (int i = 0; i < (pesos.length -1); i++) {
           
           if ( pesos[i+1] >  pesos[i] && pesos[i+1] >  pesos[indmayorpeso])
               
               indmayorpeso= i+1;            
        }
         
       System.out.println("La esfera de mayor peso es la " + names[indmayorpeso]);
    }
}
