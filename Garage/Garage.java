package Garage;

public class Garage {
    private String name;
    private int phone;
    private String address;
    private int openingHours;
    private int price;
    private int totalcarsReceived;
    private int maximumCapacity;

    public Garage(String name, int phone, String address, int openingHours, int price, int totalcarsReceived,
                  int maximumCapacity) {
        super();
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.openingHours = openingHours;
        this.price = price;
        this.totalcarsReceived = totalcarsReceived;
        this.maximumCapacity = maximumCapacity;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getOpeningHours() {
        return openingHours;
    }
    public void setOpeningHours(int openingHours) {
        this.openingHours = openingHours;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getTotalcarsReceived() {
        return totalcarsReceived;
    }
    public void setTotalcarsReceived(int totalcarsReceived) {
        this.totalcarsReceived = totalcarsReceived;
    }
    public int getMaximumCapacity() {
        return maximumCapacity;
    }
    public void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }


    @Override
    public String toString() {
        return "Garage name=" + name + ", phone=" + phone + ", address=" + address + ", openingHours=" + openingHours
                + ", price=" + price + ", totalcarsReceived=" + totalcarsReceived + ", maximumCapacity="
                + maximumCapacity + "";
    }

    public void Enter() {
        return;
    }

    public void update() {
        return;
    }

    public void withdraw() {
        return;
    }

    public void inform() {
        return;
    }

}
