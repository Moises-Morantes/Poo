package parte_1;
import java.util.Scanner;
import java.util.Random;

public class Ejercicio_13 {
    public static void main(String[] args) {
        double ValCom, ValPag, Descuento, Pdes = 0;
        
        String[] Color = {"Blanco", "Verde", "Amarillo", "Rojo", "Azul"};
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor total de su compra: ");
        ValCom = entrada.nextDouble();
        
        Random random = new Random();
        int indiceAleatorio = random.nextInt(Color.length);
        String ColorElegido = Color[indiceAleatorio];
        
        if (ColorElegido.equals("Blanco")) {
            Pdes = 0;
        } else if (ColorElegido.equals("Verde")) {
            Pdes = 10;
        } else if (ColorElegido.equals("Amarillo")) {
            Pdes = 25;
        } else if (ColorElegido.equals("Azul")) {
            Pdes = 50;
        } else {
            Pdes = 100;
        }
       
        ValPag = ValCom - (1.0 / 100) * Pdes * ValCom;
        
        System.out.println("El color que le ha tocado es: " + ColorElegido + " por lo cual se le aplico un descuento de "+ Pdes+ "%");
        System.out.println("El valor de su compra es: " + ValPag);
    }
}