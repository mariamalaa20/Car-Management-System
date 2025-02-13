class PassengerCar extends Car {
    String FuelType;

    PassengerCar(String Brand, String Model) {
        super(Brand, Model);
    }

    public void displayPassengerCar(String FuelType) {
        System.out.println("Passenger Car Brand: " + this.Brand);
        System.out.println("Passenger Car Model: " + this.Model);
        System.out.println("Passenger Car Fuel Type: " + FuelType);
    }
}