import java.util.Scanner;
public class SumaVentas {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*
            Realizar una aplicacion de "Sistema de ingreso de ventas diarias", deberá
        solicitar la cantidad de ventas y solicitar por teclado el valor de esas ventas
        (de cada una), finalmente mostrar la suma de todas las ventas.
        */
        int numVentas,sumaVentas=0,venta;
        
        System.out.println("Ingrese el número de ventas");
        numVentas=sc.nextInt();
        
        for(int i=1;i<=numVentas;i++){
            System.out.println("ingrese el valor de la venta: "+i);
            venta=sc.nextInt();
            
            //acumular el valor de las ventas
            sumaVentas=sumaVentas+venta;
        }
        System.out.println("El total de ventas diarias es: $"+sumaVentas);
        
   }
       
}