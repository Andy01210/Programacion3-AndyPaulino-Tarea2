import java.util.Scanner;

public class Main{
public static void main(){
    Scanner leer = new Scanner(System.in);
    Agencia agencia = new Agencia();
    int op;
    do{
        System.out.println("====================================");
        System.out.println("       REGISTRO DE VEHÍCULOS");
        System.out.println("====================================");
        System.out.println("1. Registrar vehículo");
        System.out.println("2. Mostrar vehículos");
        System.out.println("3. Mostrar vehículos por marca");
        System.out.println("4. Buscar vehículo por placa");
        System.out.println("5. Salir");
        op = leer.nextInt();
        
        
         switch(op){
             case 1:
                 agencia.Registrar();
                 Cls();
                 break;
             case 2:
                 agencia.Mostrar();
                 Cls();
                 break;
             case 3:
                 agencia.MostrarPorMarca();
                 Cls();
                 break;
             case 4:
                 agencia.BuscarPlaca();
                 Cls();
                 break;
            case 5:
                System.out.println("Gracias por escogernos");
                break;
            default :
                System.out.println("Opcion no validad");
                Cls();
                break;

         }
        }while(op!= 5);
}   



    static void Cls(){
        Scanner leer = new Scanner(System.in);
    leer.nextLine();
    leer.nextLine();
    for(int i =0; i< 30; i++){
        System.out.println();
    }
}
}