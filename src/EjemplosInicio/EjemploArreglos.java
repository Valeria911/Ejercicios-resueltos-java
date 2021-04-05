
import java.util.Scanner;

public class EjemploArreglos {

    public static void main(String[] args) {
        /*
        arreglo x posiciones y mostrar por consola el valor de la posición
        arreglo - filas
        matriz - filas, columnas
         */
        int tam = 10;
        int num[] = new int[tam];

        rellenar(num);
        mostrar(num);
        //num - dentro del main, es el original es la variable con la que se va a trabajar
        // num - the rial
    }

    public static void rellenar(int lista[]) {//variable, arreglo y es numero Entero
        //lista - es el impostor
        //cuando lo llamo, digo ok, te reemplazo por el que tiene la misma
        //estructura.

        Scanner sc = new Scanner(System.in);//pidiendo datos
        for (int i = 0; i < lista.length; i++) {
            //for- inicializa en 0
            /*
                inicializa en 0, porque los arreglos inician en 0
            (en todos los lenguajes de programación).
            - condicion:
                contador es menor al tamaño de mi arreglo entonces
            -incremento/decremento
                   incrementa en 1

             */
            System.out.println("Ingrese un numero");
            int dato = sc.nextInt();
            lista[i] = dato;
        }
    }

    public static void mostrar(int lista[]) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println("En la posicion: " + i + " Está el valor " + lista[i]);
        }
    }
}
