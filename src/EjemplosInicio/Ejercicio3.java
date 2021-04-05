/*
	cuando ingreso por teclado un decimal
	debe ir con ","
	pero el resultado lo mostrará con un "." 
	para el separador de decimales.

*/
import java.util.Scanner;
public class Ejercicio3{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//area = base*altura;
		double base,altura,area;

		System.out.println("Ingrese base del rectangulo");
		base=sc.nextDouble();

		System.out.println("Ingrese altura del rectangulo");
		altura=sc.nextDouble();

		area=base*altura;

		System.out.println("El área de mi rectangulo es: "+area);

	}
}