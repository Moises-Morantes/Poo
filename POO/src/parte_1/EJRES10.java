/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejres10;

    import java.util.Scanner;

public class EJRES10 {

    public static void main(String[] args) {
        
        Estudiante_class ESTUD1 = new Estudiante_class ();
        
        Scanner NI = new Scanner(System.in);
        System.out.println("Ingrese el numero de inscripción");
        ESTUD1.NI = NI.nextLine() ;
        
        Scanner NOM = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante");
        ESTUD1.NOM = NOM.nextLine();
        
        Scanner PAT = new Scanner(System.in);
        System.out.println("Ingrese el patrimonio del estudiante");
        ESTUD1.PAT = PAT.nextFloat();
        
        Scanner ES = new Scanner(System.in);
        System.out.println("Ingrese el estrato del estudiante");
        ESTUD1.EST = ES.nextInt();
        
        ESTUD1.PAGMAT = 50000;
        
        if( ESTUD1.PAT > 2000000 && ESTUD1.EST > 3 ) {
            ESTUD1.PAGMAT = ESTUD1.PAGMAT + (0.03*ESTUD1.PAT);
        }
        
        System.out.println("El estudiante con numero de inscripción " + ESTUD1.NI + " y nombre "+ ESTUD1.NOM + ", debe pagar: $ "+ESTUD1.PAGMAT);
    }
    
}
