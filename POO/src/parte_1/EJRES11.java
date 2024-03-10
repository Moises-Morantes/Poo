/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejres11;

    import java.util.Scanner;

public class EJRES11 {

    public static void main(String[] args) {
        double Mayor, A, B, C;
        
        Scanner a = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        A = a.nextFloat() ;
        
        Scanner b = new Scanner(System.in);
        System.out.println("Ingrese el segundo numero");
        B = b.nextFloat();
        
        Scanner c = new Scanner(System.in);
        System.out.println("Ingrese el tercer numero");
        C = c.nextFloat(); 
        
        Mayor=0;
        
        if( A>B && A>C){
            Mayor = A;
        }else if (B>C) {
            Mayor = B;
        }else {
            Mayor = C;
        }
        
        System.out.println("El mayor valor entre: "+A+","+B+" y "+C+" Es: "+Mayor);
    }
}
