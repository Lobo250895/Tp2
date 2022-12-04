package Garage;

import java.util.Date;

public class Ticket {
    private int codFactura;
    private Date Date;
    private Date CheckinTime;
    private java.util.Date DepartureTime;
    private int valor;
    private int Comprobante;


    public void Agregar() {
        return;
    }
    public void Anular() {
        return;
    }

    public int getComprobante() {
        return Comprobante;
    }

    public int getCodFactura() {
        return codFactura;
    }
    public void setCodFactura(int codFactura) {
        this.codFactura = codFactura;
    }
    public Date getDate() {
        return Date;
    }
    public void setDate(Date date) {
        Date = date;
    }
    public Date getCheckinTime() {
        return CheckinTime;
    }
    public void setCheckinTime(Date checkinTime) {
        CheckinTime = checkinTime;
    }
    public Date getDepartureTime() {
        return DepartureTime;
    }
    public void setDepartureTime(Date departureTime) {
        DepartureTime = departureTime;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }


    public Ticket(int codFactura, java.util.Date date, java.util.Date checkinTime, java.util.Date departureTime,
                  int valor, int comprobante) {
        super();
        this.codFactura = codFactura;
        Date = date;
        CheckinTime = checkinTime;
        DepartureTime = departureTime;
        this.valor = valor;
        Comprobante = comprobante;
    }


}
