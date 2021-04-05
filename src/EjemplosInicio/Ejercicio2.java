import java.util.Scanner;

public class Ejercicio2{
	 public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String nombre, apellidos;

        System.out.println("Ingrese su nombre");
        nombre = lector.next().trim();//solo una palabra
        //nombre=lector.nextLine();//acepta una frase
        
        lector.skip("\n");
        System.out.println("Ingrese su apellidos");
        apellidos = lector.nextLine().trim();

        System.out.println("Bienvenido: " + nombre + " " + apellidos);
    }
}