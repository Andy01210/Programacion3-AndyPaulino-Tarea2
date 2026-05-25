import java.util.ArrayList;
import java.util.Scanner;

public class Agencia {
    Scanner leer = new Scanner(System.in);
    ArrayList<Vehiculo> Arreglo = new ArrayList<Vehiculo>();



    public void Registrar(){
        leer.nextLine();
        System.out.println("Ingrese la marca del vehiculo");
        String marca = leer.nextLine();
        System.out.println("Ingrese la placa del vehiculo");
        String placa = leer.nextLine();
        System.out.println("Ingrese la modelo del vehiculo");
        String modelo = leer.nextLine();
        System.out.println("Ingrese la color del vehiculo");
        String color = leer.nextLine();
        System.out.println("Ingrese el Año del vehiculo");
        int ano = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el precio del vehiculo");
        double precio = leer.nextDouble();
        leer.nextLine();

        Arreglo.add(new Vehiculo(marca,placa,modelo,color,ano,precio));

    }

    public void Mostrar(){
        for(Vehiculo vehiculo : Arreglo){
            System.out.println("Marca: "+ vehiculo.getMarca());
            System.out.println("Modelo: "+ vehiculo.getModelo());
            System.out.println("Placa: "+ vehiculo.getPlaca());
            System.out.println("Color: "+ vehiculo.getColor());
            System.out.println("Año: "+ vehiculo.getAno());
            System.out.println("Precio: "+ vehiculo.getPrecio());
            System.out.println("------------------------------------------\n");
        }
    }

    public void MostrarPorMarca(){
        System.out.println("Ingrese la marca que le interesa");
        String marca = leer.nextLine();
         for(Vehiculo vehiculo : Arreglo){
        if(marca.equalsIgnoreCase(vehiculo.getMarca())){
            System.out.println("Placa: "+ vehiculo.getPlaca());
            System.out.println("Modelo: "+ vehiculo.getModelo());
            System.out.println("Color: "+ vehiculo.getColor());
            System.out.println("Año: "+ vehiculo.getAno());
            System.out.println("Precio: "+ vehiculo.getPrecio());
             System.out.println("------------------------------------------\n");
        }
    }

    }

    public void BuscarPlaca(){
        System.out.println("Ingrese la placa a buscar");
        String pl = leer.nextLine();

        for(Vehiculo vehiculo : Arreglo){
        if(pl.equals(vehiculo.getPlaca())){
            System.out.println("Marca: "+ vehiculo.getMarca());
            System.out.println("Modelo: "+ vehiculo.getModelo());
            System.out.println("Color: "+ vehiculo.getColor());
            System.out.println("Año: "+ vehiculo.getAno());
            System.out.println("Precio: "+ vehiculo.getPrecio());
            return;
        }
    }
            System.out.println("Placa no encontrada");
    }
    
}
