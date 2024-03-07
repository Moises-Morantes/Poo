package parte_1;

import java.util.Scanner;

public class Ejercicio_15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese los pesos de las esferas A, B, C y D. \nRecuerde que 3 esferan tienen que tener el mismo peso.");
        int pesoA = entrada.nextInt();
        int pesoB = entrada.nextInt();
        int pesoC = entrada.nextInt();
        int pesoD = entrada.nextInt();
        
        if (pesoA == pesoB) {
            // Esfera diferente: C o D
            if (pesoC < pesoA) {
                System.out.println("La esfera diferente es C y es menos pesada.");
            } else {
                System.out.println("La esfera diferente es D y es más pesada.");
            }
        } else if (pesoA == pesoC) {
            // Esfera diferente: B o D
            if (pesoB < pesoA) {
                System.out.println("La esfera diferente es B y es menos pesada.");
            } else {
                System.out.println("La esfera diferente es D y es más pesada.");
            }
        } else {
            // Esfera diferente: A o B
            if (pesoA < pesoD) {
                System.out.println("La esfera diferente es A y es menos pesada.");
            } else {
                System.out.println("La esfera diferente es C y es más pesada.");
            }
        }
    }
}