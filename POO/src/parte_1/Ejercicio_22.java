package parte_1;
import java.util.Scanner;

//Elaborar un algoritmo que entre el nombre de un empleado, su salario básico por hora y el 
//número de horas trabajadas en el mes; escriba su nombre y salario mensual si éste es mayor 
//de $450.000, de lo contrario escriba sólo el nombre. 
public class Ejercicio_22 {
	public static void main(String[]args) {
	
		        Scanner input = new Scanner(System.in);

		        System.out.println("Ingrese el nombre del empleado:");
		        String nombre = input.nextLine();

		        System.out.println("Ingrese el salario básico por hora:");
		        double salarioHora = input.nextDouble();

		        System.out.println("Ingrese el número de horas trabajadas en el mes:");
		        double horasTrabajadas = input.nextDouble();

		        double salarioMensual = salarioHora * horasTrabajadas;

		        if (salarioMensual > 450000) {
		            System.out.println("Nombre del empleado: " + nombre);
		            System.out.println("Salario Mensual: $" + salarioMensual);
		        } else {
		            System.out.println("Nombre del empleado: " + nombre);
		        }

		        input.close();
		}
}
	
