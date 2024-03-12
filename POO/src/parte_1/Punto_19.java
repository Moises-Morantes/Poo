import java.util.Scanner;

public class Punto_19 {
    public static void main(String[] args) {
        double lado, perimetro, area, altura;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor del lado del triángulo en metros ");
        while (!entrada.hasNextDouble()) {
            System.out.println("Incorrecto: Por favor, ingrese un número válido");
            entrada.next(); 
        }
        lado = entrada.nextDouble();
        
        if (lado <= 0) {
            System.out.println("Incorrecto: El lado del triángulo debe ser un número positivo");
            return; 
        }
        
        perimetro = lado * 3;
        altura = (lado * Math.sqrt(3)) / 2;
        area = (lado * altura) / 2;
        
        System.out.println("El perímetro es de " + perimetro + " metros");
        System.out.println("La altura es de " + altura + " metros");
        System.out.println("El área es de " + area + " metros cuadrados");
        
        entrada.close(); 
    }
}

