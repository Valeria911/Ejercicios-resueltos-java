import java.util.Scanner; // primero importar

public class EjemploOperaciones{//apertura de la clase

	public static void main(String[] args) {//inicio main
		Scanner lector=new Scanner(System.in);//luego definirlo como variable
			//System.in - input
		int num1;
		int num2;
		int resultado;

		System.out.println("ingrese num1");
		num1=lector.nextInt(); // utilizar el lector.


		System.out.println("ingrese num2");
		num2=lector.nextInt();

		resultado=num1+num2;

		System.out.println("El resultado es: "+resultado);
		//System.out - output

	}//fin main
}//cierre de clase