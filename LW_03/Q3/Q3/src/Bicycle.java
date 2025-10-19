public class Bicycle {
    private String brand;
    private int gear;
    private Owner owner;

    public Bicycle(String brand, int gear, Owner owner) {
        this.brand = brand;
        this.gear = gear;
        this.owner = owner;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Gear: " + gear);
        System.out.println("Owner Name: " + owner.getOwnerName());
        System.out.println("Phone No: " + owner.getPhoneNo());
    }
}

