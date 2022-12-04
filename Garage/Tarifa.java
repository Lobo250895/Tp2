package Garage;

public class Tarifa {
    private int codTarifa;
    private String TipoTarifa;
    private String TipoVehiculo;

    public void ingresa() {
        return;
    }
    public void Sale() {
        return;
    }
    public void Modify() {
        return;
    }

    public int getCodTarifa() {
        return codTarifa;
    }

    public void setCodTarifa(int codTarifa) {
        this.codTarifa = codTarifa;
    }

    public String getTipoTarifa() {
        return TipoTarifa;
    }

    public void setTipoTarifa(String tipoTarifa) {
        TipoTarifa = tipoTarifa;
    }

    public String getTipoVehiculo() {
        return TipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        TipoVehiculo = tipoVehiculo;
    }

    public Tarifa(int codTarifa, String tipoTarifa, String tipoVehiculo) {
        this.codTarifa = codTarifa;
        TipoTarifa = tipoTarifa;
        TipoVehiculo = tipoVehiculo;
    }


    @Override
    public String toString() {
        return "Tarifa{" +
                "codTarifa=" + codTarifa +
                ", TipoTarifa='" + TipoTarifa + '\'' +
                ", TipoVehiculo='" + TipoVehiculo + '\'' +
                '}';
    }
}
