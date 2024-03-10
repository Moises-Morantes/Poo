package parte_1;
import java.util.Scanner;

public class Ejercicio_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el código del empleado:");
        int codigoEmpleado = input.nextInt();
        input.nextLine(); 

        System.out.println("Ingrese los nombres del empleado:");
        String nombres = input.nextLine();

        System.out.println("Ingrese el número de horas trabajadas al mes:");
        double horasTrabajadas = input.nextDouble();
        input.nextLine();

        System.out.println("Ingrese el valor de la hora trabajada:");
        double valorHora = input.nextDouble();
        input.nextLine(); 

        System.out.println("Ingrese el porcentaje de retención en la fuente:");
        double retencionFuente = input.nextDouble();

        double salarioBruto = horasTrabajadas * valorHora;
        double salarioNeto = salarioBruto - (salarioBruto * (retencionFuente / 100));
        System.out.println("Código del empleado: " + codigoEmpleado);
        System.out.println("Nombres: " + nombres);
        System.out.println("Salario Bruto: $" + salarioBruto);
        System.out.println("Salario Neto: $" + salarioNeto);

        input.close();
    }
}