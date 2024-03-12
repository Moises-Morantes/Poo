import java.util.Scanner;

public class Punto_14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float VD1, VD2, VD3, SALAR, VENTOTAL, PORVEN;
        float SALARIO1, SALARIO2, SALARIO3;

        System.out.println("Ingrese las ventas del departamento 1: ");
        VD1 = entrada.nextFloat();

        System.out.println("Ingrese las ventas del departamento 2: ");
        VD2 = entrada.nextFloat();

        System.out.println("Ingrese las ventas del departamento 3: ");
        VD3 = entrada.nextFloat();

        System.out.println("Ingrese el salario de los vendedores en cada departamento: ");
        SALAR = entrada.nextFloat();

        VENTOTAL = VD1 + VD2 + VD3; 

        PORVEN = 0.33f * VENTOTAL; 

        if (VD1 > PORVEN) {
            SALARIO1 = SALAR + 0.2f * SALAR;
        } else {
            SALARIO1 = SALAR;
        }

        if (VD2 > PORVEN) {
            SALARIO2 = SALAR + 0.2f * SALAR;
        } else {
            SALARIO2 = SALAR;
        }

        if (VD3 > PORVEN) {
            SALARIO3 = SALAR + 0.2f * SALAR;
        } else {
            SALARIO3 = SALAR;
        }

        System.out.println("SALARIO VENDEDORES DEPTO. 1: " + SALARIO1);
        System.out.println("SALARIO VENDEDORES DEPTO. 2: " + SALARIO2);
        System.out.println("SALARIO VENDEDORES DEPTO. 3: " + SALARIO3);

        entrada.close(); 
    }
}

