class Truck extends Vehicle {
    private double payload;

    public Truck(String make, String model, int year, double payload) {
        super(make, model, year);
        this.payload = payload;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf(", Payload: %.1f tons\n", payload);
    }
}