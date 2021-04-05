
/*
Crear una aplicación que, al ingresar una palabra, determine si
está en mayúsculas, minúsculas o mezcladas.
 */
//equals - ==
//toUpperCase - mayusculas
//toLowerCase - minusculas
import java.util.Scanner;

public class MayusculaMinuscula {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una palabra");
        String palabra = sc.next().trim(); //trim quita espacios al inicio o final
        String mayusculas = palabra.toUpperCase();//transformar a Mayusculas
        String minusculas = palabra.toLowerCase();//Transformar a minusculas

        if (palabra.equals(mayusculas)) { // ==
            System.out.println("La palabra está en mayúsculas");

        } else if (palabra.equals(minusculas)) {
            System.out.println("La palabra está en minúsculas");

        } else {
            System.out.println("Las mayúsculas y minúsculas están mezcladas");
        }

    }

}
