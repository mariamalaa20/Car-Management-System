public class Main {
    public static void main(String[] args) {
        Car o1 = new Car("Renault", "Clio");
        o1.displayCar();
        System.out.println("\n");

        PassengerCar b1 = new PassengerCar("Dacia", "Sandero");
        b1.displayPassengerCar("Diesel");
        System.out.println("\n");

        CommercialPassengerCar tb1 = new CommercialPassengerCar("Tofas", "Kartal");
        tb1.displayCommercialPassengerCar("250LT");
    }
}