
import java.util.Scanner;

public class VentaEntradas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int entradas = 3000;
        int cantidad, total;
        System.out.println("Bienvenido!");
        System.out.println("Costo de las entradas: " + entradas);
        System.out.println("Ingrese cantidad de entradas que desea comprar:");

        cantidad = sc.nextInt();
        total = entradas * cantidad;

        System.out.println("cantidad entradas: " + cantidad);
        System.out.println("Total a pagar $:" + total);

    }
}
