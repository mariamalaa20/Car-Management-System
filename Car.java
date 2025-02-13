class Car {
    String Brand;
    String Model;

    Car() {}

    Car(String Brand, String Model) {
        this.Brand = Brand;
        this.Model = Model;
        System.out.println(this.Brand + " " + this.Model);
    }

    public void displayCar() {
        System.out.println("Car Brand: " + this.Brand);
        System.out.println("Car Model: " + this.Model);
    }
}