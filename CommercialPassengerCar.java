class CommercialPassengerCar extends Car {
    String TrunkCapacity;

    CommercialPassengerCar(String Brand, String Model) {
        super(Brand, Model);
    }

    public void displayCommercialPassengerCar(String TrunkCapacity) {
        System.out.println("Commercial Passenger Car Brand: " + this.Brand);
        System.out.println("Commercial Passenger Car Model: " + this.Model);
        System.out.println("Commercial Passenger Car Trunk Capacity: " + TrunkCapacity);
    }
}
