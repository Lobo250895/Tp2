package Garage;

import java.util.Date;

public class Vehiculo {
    private String Patent;
    private int DNIClient;
    private String TypeofCar;
    private Date Date;
    private java.util.Date CheckinTime;
    private String State;
    private Date DepartureTime;

    public void ingresa() {
        return;
    }
    public void Sale() {
        return;
    }
    public void Modify() {
        return;
    }


    public String getPatent() {
        return Patent;
    }
    public void setPatent(String patent) {
        Patent = patent;
    }
    public int getDNIClient() {
        return DNIClient;
    }
    public void setDNIClient(int dNIClient) {
        DNIClient = dNIClient;
    }
    public String getTypeofCar() {
        return TypeofCar;
    }
    public void setTypeofCar(String typeofCar) {
        TypeofCar = typeofCar;
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
    public String getState() {
        return State;
    }
    public void setState(String state) {
        State = state;
    }
    public Date getDepartureTime() {
        return DepartureTime;
    }
    public void setDepartureTime(Date departureTime) {
        DepartureTime = departureTime;
    }

    public Vehiculo(String patent, int dNIClient, String typeofCar, java.util.Date date, java.util.Date checkinTime,
                    String state, java.util.Date departureTime) {
        super();
        Patent = patent;
        DNIClient = dNIClient;
        TypeofCar = typeofCar;
        Date = date;
        CheckinTime = checkinTime;
        State = state;
        DepartureTime = departureTime;
    }

    @Override
    public String toString() {
        return "Vehiculo [Patent=" + Patent + ", DNIClient=" + DNIClient + ", TypeofCar=" + TypeofCar + ", Date=" + Date
                + ", CheckinTime=" + CheckinTime + ", State=" + State + ", DepartureTime=" + DepartureTime + "]";
    }




}
