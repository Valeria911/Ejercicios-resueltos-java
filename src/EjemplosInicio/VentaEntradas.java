
import java.util.Scanner;

public class VentaEntradas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ENTRADAS = 3000; //mayusculas porque es una constante
        int cantidad, total;
        System.out.println("Bienvenido!");
        System.out.println("Costo de las entradas: " + ENTRADAS);
        System.out.println("Ingrese cantidad de entradas que desea comprar:");

        cantidad = sc.nextInt();
        total = ENTRADAS * cantidad;

        System.out.println("cantidad entradas: " + cantidad);
        System.out.println("Total a pagar $:" + total);

    }
}
