
package com.mycompany.ejprop23;
    import java.util.Scanner;
public class EJPROP23 {

    public static void main(String[] args) {
        double sln1, sln2, rootterm;
        ECN2G_class ecn1 = new ECN2G_class(); //En esta linea se crea el objeto ecn1 
        
        Scanner A = new Scanner(System.in);
        System.out.println("Ingrese el valor que acompaña al termino cuadratico:");
        ecn1.A = A.nextFloat() ;
        
        Scanner B = new Scanner(System.in);
        System.out.println("Ingrese el valor que acompaña al termino lineal:");
        ecn1.B = B.nextFloat();
        
        Scanner C = new Scanner(System.in);
        System.out.println("Ingrese el valor del termino independiente:");
        ecn1.C = C.nextFloat();
        
        rootterm = Math.pow(ecn1.B, 2)-(4*ecn1.A*ecn1.C);
        sln1 = (-(ecn1.B) + Math.sqrt(rootterm))/(2*ecn1.A);
        sln2 = (-(ecn1.B) - Math.sqrt(rootterm))/(2*ecn1.A);
        
        if( rootterm < 0 ) {
            System.out.println("La ecuacion no tiene soluciones reales");  
        }else if (sln1==0 && sln2==0) {
            System.out.println("La solucion de la ecuacion es: " + 0);
        }else {
            System.out.println("Las soluciones a la ecuacion son: ");
            System.out.println(sln1);
            System.out.println(sln2);
        }
           
    }
}

