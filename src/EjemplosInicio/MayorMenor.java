
import java.util.Scanner;//

public class MayorMenor {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num1, num2;

        System.out.println("Ingrese el primer número");//solicitud
        num1 = lector.nextInt(); //ingreso
        System.out.println("Ingrese el segundo numero");//solicitud
        num2 = lector.nextInt();//ingreso

        if (num1 > num2) {//Si(condicion) Entonces
            System.out.println("El primer numero es mayor");
        }//FinSi
        else if (num1 == num2) {
            System.out.println("Los numeros son iguales");
        } else {//SiNo
            System.out.println("El segundo numero es mayor");
        }//FinSiNo

    }
}
