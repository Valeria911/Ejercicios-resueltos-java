import java.util.Scanner;
public class EjemploClase13 {
    //psvm+tabular 

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int opcion;
        
           //Repetir - do-While
        do{ 
        System.out.println("Seleccione una opción");
        System.out.println("1. Ciclo For");
        System.out.println("2. Ciclo While");
        System.out.println("3. Salir");
        
        opcion=sc.nextInt();
        
        switch(opcion){
            case 1:
                cicloFor();
            break;
            case 2:
                cicloWhile();
            break;
            case 3:
                System.out.println("Ha salido con exito");
            break;
            default:
                System.out.println("Opción no válida");
                break;
        } 
        }while(opcion!=3);   
    }      
    
   public static void cicloFor(){
       System.out.println("Ha seleccionado Ciclo For");
       for(int i=1;i<=100;i++){
           if(i%2==0 && i%3==0 ){
               System.out.println(i);
           }
       }     
   }//Fin metodo cicloFor 
   
   public static void cicloWhile(){
       System.out.println("Ha seleccionado Ciclo While");
       int i=1;
      //definir el ciclo while
      while(i<=100){
          if(i%2==0 && i%3==0 ){
               System.out.println(i);
          }
          i++;
      }
   }
       
}//Fin clase Principal