
/*
Realizar una aplicación con menú donde sea posible elegir qué
operación desea realizar. Entre estas opciones deberán estar las
siguientes: Sumar, restar,dividir, multiplicar.
 */
import java.util.Scanner;

public class MenuCalculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion, num1, num2, resultado;
        double n1, n2, result;

        System.out.println("*********Menu*********");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");

        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ha seleccionado SUMA");
                System.out.println("Ingrese el primer número");
                num1 = sc.nextInt();
                System.out.println("Ingrese el segundo número");
                num2 = sc.nextInt();
                resultado = num1 + num2;
                System.out.println("El resultado es: " + resultado);
                break;

            case 2:
                System.out.println("Ha seleccionado RESTA");
                System.out.println("Ingrese el primer número");
                num1 = sc.nextInt();
                System.out.println("Ingrese el segundo número");
                num2 = sc.nextInt();
                resultado = num1 - num2;
                System.out.println("El resultado es: " + resultado);
                break;

            case 3:
                System.out.println("Ha seleccionado MULTIPLICACIÓN");
                System.out.println("Ingrese el primer número");
                num1 = sc.nextInt();
                System.out.println("Ingrese el segundo número");
                num2 = sc.nextInt();
                resultado = num1 * num2;
                System.out.println("El resultado es: " + resultado);
                break;

            case 4:
                System.out.println("Ha seleccionado DIVISIÓN");
                System.out.println("Ingrese el primer número");
                n1 = sc.nextDouble();
                System.out.println("Ingrese el segundo número");
                n2 = sc.nextDouble();
                result = n1 / n2;

                System.out.println("El resultado es: " + result);
                break;

            case 5:
                System.out.println("Ha salido de la aplicación");
                break;

            default:
                System.out.println("opción no valida");
                break;

        }

    }
}
