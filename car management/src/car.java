class Car extends Vehicle {
    private int doors;

    public Car(String make, String model, int year, int doors) {
        super(make, model, year);
        this.doors = doors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf(", %d-door car\n", doors);
    }
}