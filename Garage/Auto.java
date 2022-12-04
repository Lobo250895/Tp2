package Garage;

public class Auto extends Vehiculo{
    private String Marca;
    private Integer numeroPuertas;


    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    public Integer getNumeroPuertas() {
        return numeroPuertas;
    }
    public void setNumeroPuertas(Integer numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public void Desplazarse() {
        return;
    }


    public Auto(String patent, int dNIClient, String typeofCar, java.util.Date date, java.util.Date checkinTime,
                String state, java.util.Date departureTime, String marca, Integer numeroPuertas) {
        super(patent, dNIClient, typeofCar, date, checkinTime, state, departureTime);
        Marca = marca;
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return "Auto [Marca=" + Marca + "]";
    }


}
