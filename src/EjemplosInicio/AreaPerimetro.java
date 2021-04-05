
import java.util.Scanner;

public class AreaPerimetro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ancho, largo, perimetro, area;//Entero grande, el más grande de todos los enteros

        System.out.println("Ingrese el ancho del terreno:");
        ancho = sc.nextLong();

        System.out.println("Ingrese el largo del terreno:");
        largo = sc.nextLong();

        perimetro = (2 * ancho) + (largo * 2);
        area = ancho * largo;

        System.out.println("El perímetro es: " + perimetro);
        System.out.println("El área es: " + area);
    }
}
