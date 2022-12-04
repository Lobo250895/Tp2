package Garage;

public class Cliente {
    private int idClient;
    private String name;
    private int DNI;
    private int phone;
    private String Address;

    public Cliente(int idClient, String name, int DNI, int phone, String address) {
        super();
        this.idClient = idClient;
        this.name = name;
        DNI = DNI;
        this.phone = phone;
        Address = address;
    }

    public int getIdClient() {
        return idClient;
    }
    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDNI() {
        return DNI;
    }
    public void setDNI(int dNI) {
        DNI = dNI;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }

    public void Enter() {
        return;
    }

    public void usaServicio() {
        return;
    }

    public void Delete() {
        return;
    }

    public void Modify() {
        return;
    }

    @Override
    public String toString() {
        return "Cliente idClient=" + idClient + ", name=" + name + ", DNI=" + DNI + ", phone=" + phone + ", Address="
                + Address + "";
    }


}
