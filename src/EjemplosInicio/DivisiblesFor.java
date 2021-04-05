
public class DivisiblesFor {

    public static void main(String[] args) {

        // imprimir en pantalla numeros divisibles entre 2 o 3 (1-100)
        // cambiar a divisibles entre 2 y 3
        //Ciclo for
        //definicion de ciclo
        for (int i = 1; i <= 100; i++) {//ejecutar el ciclo y tener datos del 1-100
            if (i % 2 == 0 || i % 3 == 0) {
                System.out.println(i);
            }
        }

    }
}
