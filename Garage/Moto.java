package Garage;

public class Moto extends Vehiculo{
    private String Marca;
    private int Cilindrada;


    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    public int getCilindrada() {
        return Cilindrada;
    }
    public void setCilindrada(int cilindrada) {
        Cilindrada = cilindrada;
    }

    public void Desplazarse() {
        return;
    }

    public Moto(String patent, int dNIClient, String typeofCar, java.util.Date date, java.util.Date checkinTime,
                String state, java.util.Date departureTime, String marca, int cilindrada) {
        super(patent, dNIClient, typeofCar, date, checkinTime, state, departureTime);
        Marca = marca;
        Cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Moto [Marca=" + Marca + ", Cilindrada=" + Cilindrada + "]";
    }

}
