import java.util.Scanner;

public class Punto_12 {
    public static void main(String[] args) {
        double valor_hora, salario;
        String nombre;
        int horas_trabajadas;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Nombre del trabajador");
        nombre = entrada.nextLine();
        
        System.out.println("Numero de horas trabajadas");
        horas_trabajadas = entrada.nextInt();
        entrada.nextLine(); 
        
        System.out.println("Valor hora de trabajo");
        valor_hora = entrada.nextDouble();
        entrada.nextLine(); 
        
        if (horas_trabajadas < 0) {
            System.out.println("Incorrecto: Las horas trabajadas no pueden ser negativas");
            return; 
        }
        
        if (horas_trabajadas > 40) {
            int limite_horas = horas_trabajadas - 40;
            if (limite_horas > 8) {
                limite_horas = 8; 
            }
            salario = (40 * valor_hora) + (limite_horas * valor_hora * 2) + ((horas_trabajadas - 40 - limite_horas) * valor_hora * 3);
        } else {
            salario = horas_trabajadas * valor_hora;
        }
        
        System.out.println("El trabajador " + nombre + " recibe un salario de $" + salario);
        entrada.close(); 
    }
}



