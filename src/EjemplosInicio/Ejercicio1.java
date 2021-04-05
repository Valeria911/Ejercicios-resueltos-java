/*
	Ejercicio1: verificar si un número es par o impar
	- El número debe ser ingresado por teclado.

	mod - %
*/
	import java.util.Scanner;

	public class Ejercicio1{//inicio de la clase
		public static void main(String[] args) {//inicio main
			Scanner sc=new Scanner(System.in);
			int num;

			System.out.println("Ingrese un número Entero");
			num=sc.nextInt();

			if(num%2==0){//inicio if
				System.out.println("Es un número par");
			}//fin if
			else{//inicio else
				System.out.println("Es un número Impar");
			}//fin else

		}//fin main
	}//fin clase