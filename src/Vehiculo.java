public class Vehiculo {
    private String Marca;
    private String Modelo;
    private String Color;
    private String Placa;
    private int Ano;
    private Double Precio;

    public Vehiculo(){

    }
     public Vehiculo(String marca, String placa, String modelo, String color, int ano, double precio){
       setMarca(marca);
       setPlaca(placa);
       setColor(color); 
       setModelo(modelo);
       setAno(ano);
       setPrecio(precio);
    }
    public void setMarca(String marca){ Marca = marca;}
    public void setModelo(String modelo){ Modelo = modelo;}
    public void setColor(String color){ Color = color;}
    public void setPlaca(String placa){ Placa = placa;}
    public void setAno(int ano){ Ano = ano;}
    public void setPrecio(double precio){ Precio = precio;}

    public String getMarca(){return Marca;}
    public String getModelo(){return Modelo;}
    public String getColor(){return Color;}
    public String getPlaca(){return Placa;}
    public int getAno(){ return Ano;}
    public double getPrecio(){ return Precio;}

}
