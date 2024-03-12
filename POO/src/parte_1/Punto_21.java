import java.util.Scanner;

public class Punto_21 {
    public static void main(String[] args) {
        double a, b, c, perimetro, semiperimetro, area;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor del primer lado del triángulo en metros ");
        a = entrada.nextDouble();
        
        System.out.println("Ingrese el valor del segundo lado del triángulo en metros ");
        b = entrada.nextDouble();
        
        System.out.println("Ingrese el valor del tercer lado del triángulo en metros ");
        c = entrada.nextDouble();
        
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Incorrecto: Los lados del triángulo deben ser números positivos");
            return; 
        }
        
        perimetro = a + b + c;
        semiperimetro = perimetro / 2;
        area = Math.sqrt(semiperimetro * (semiperimetro - a) * (semiperimetro - b) * (semiperimetro - c));
        
        System.out.println("El perimetro es de " + perimetro + " metros");
        System.out.println("El semiperimetro es de " + semiperimetro + " metros");
        System.out.println("El area es de " + area + " metros cuadrados");
        
        entrada.close(); 
    }
}

