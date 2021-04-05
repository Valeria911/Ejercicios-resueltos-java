
import java.util.Scanner;

public class SegundosConversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long segundos, minutos, horas, dias;

        System.out.println("Ingrese segundos");
        segundos = sc.nextLong();

        dias = segundos / 86400;
        horas = segundos / 3600;
        minutos = segundos / 60;

        System.out.println("Los " + segundos + " segundos corresponden a: ");
        System.out.println("días :" + dias);
        System.out.println("horas : " + horas);
        System.out.println("minutos : " + minutos);

    }
}
