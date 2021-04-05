/*
	Ingresar un número por teclado y determinar si es múltiplo de 10.
*/

import java.util.Scanner;

public class MultiploDiez{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	

		int num;
		System.out.println("Ingrese un número entero");
		num=sc.nextInt();

		if(num%10==0){
			System.out.println("Es un múltiplo de 10"); 
		}else{
			System.out.println("No es un múltiplo de 10");
		}
	}
}