package Garage;

public class ReportedeRuedas {
    private int idReporte;
    private int PriceofWheels;
    private int halfMile;
    public String Informacion;


    public int getIdReporte() {
        return idReporte;
    }
    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }
    public int getPriceofWheels() {
        return PriceofWheels;
    }
    public void setPriceofWheels(int priceofWheels) {
        PriceofWheels = priceofWheels;
    }
    public int getHalfMile() {
        return halfMile;
    }
    public void setHalfMile(int halfMile) {
        this.halfMile = halfMile;
    }

    public String getInformacion() {
        return Informacion;
    }

    public ReportedeRuedas(int idReporte, int priceofWheels, int halfMile) {
        this.idReporte = idReporte;
        PriceofWheels = priceofWheels;
        this.halfMile = halfMile;
    }

    @Override
    public String toString() {
        return "ReportedeRuedas{" +
                "idReporte=" + idReporte +
                ", PriceofWheels=" + PriceofWheels +
                ", halfMile=" + halfMile +
                ", Informacion='" + Informacion + '\'' +
                '}';
    }
}
