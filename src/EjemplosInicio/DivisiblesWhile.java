
public class DivisiblesWhile {

    public static void main(String[] args) {
        // imprimir en pantalla numeros divisibles entre 2 o 3 (1-100)
        // y cambiar a divisibles entre 2 y 3
        int i = 1;
        //definir el ciclo while
        while (i <= 100) {
            if (i % 2 == 0 || i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }

    }
}
