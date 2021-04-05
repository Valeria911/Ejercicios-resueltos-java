
/*
El usuario deberá ingresar un número entero positivo y el código
deberá identificar si este es un número de 1,2,3 o 4 dígitos,
mostrando un mensaje que le mencione el número ingresado y de
cuántos dígitos es.
 */
import java.util.Scanner;

public class EjIfElse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//definicion
        int num; //declaracion de variables

        System.out.println("Ingrese un número entero positivo"); //mostrar mensaje de ayuda al usuario
        num = sc.nextInt(); //solicitar datos

        //1 digito
        if (num < 10 && num >= 1) {
            System.out.println("El número ingresado es: " + num + " y es de un digito");
        } //2 digitos
        else if (num >= 10 && num <= 99) {
            System.out.println("El número ingresado es: " + num + " y es de dos digitos");
        } //3 digitos
        else if (num >= 100 && num <= 999) {
            System.out.println("El número ingresado es: " + num + " y es de tres digitos");
        } else if (num >= 1000 && num <= 9999) {
            System.out.println("El número ingresado es: " + num + " y es de cuatro digitos");

        } else {
            System.out.println("El número ingresado es: " + num + " y es superior a 4 dígitos");
        }

    }
}
