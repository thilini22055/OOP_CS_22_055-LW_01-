public class TestBicycle {
    public static void main(String[] args) {
        Owner owner = new Owner("Alice", "1234567890");
        Bicycle bike = new Bicycle("Giant", 21, owner);
        bike.displayInfo();
    }
}
