import java.util.Scanner;
//import javax.swing.JOptionPane;

public class ComprobacionClave {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*
        Sistema de verificacion de contraseña, el usuario podrá intentar unicamente 3 veces 
        colocar la contraseña correcta. Si logra acceder, entonces mostrará un mensaje en 
        pantalla diciendo "Bienvenido"
        */
        
        String palabraClave="Murcielago";
        String password;
        int INTENTOS = 3;
        boolean comprobacion=false;
        //este booleano, cambiará en caso de que el usuario escriba correctamente
        //la palabra Murcielago
        
        for(int i=0;i<INTENTOS && !comprobacion;i++){
            System.out.println("Ingrese la clave");
            password=sc.next().trim();
            
            //si la palabra introducida es igual a la palabra clave
            //entonces comprobacion pasa a ser TRUE, y deja de ejecutar el ciclo
            //y muestra el mensaje de bienvenida.
            if(password.equals(palabraClave)){
               System.out.println("Bienvenido");
               //JOptionPane.showMessageDialog(null, "Bienvenido");
                comprobacion =true;
            }
        }

   }
       
}