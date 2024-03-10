/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejres7;
    import java.util.Scanner;
public class EJRES7 {

    public static void main(String[] args) {
        double A, B;
       
        Scanner a = new Scanner(System.in);
        System.out.println("Ingrese el valor de A: ");
        A = a.nextFloat() ;
        
        Scanner b = new Scanner(System.in);
        System.out.println("Ingrese el valor de B: ");
        B = b.nextFloat() ;
        
        if( A > B ) {
            
            System.out.println("A es mayor que B ");
            
        } else if ( A == B){
            
            System.out.println("A es igual a B");
            
        }else{
            
            System.out.println("A es menor que B");
        }
    }
}
