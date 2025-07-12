
class Motorcycle extends Vehicle {
    private String type;

    public Motorcycle(String make, String model, int year, String type) {
        super(make, model, year);
        this.type = type;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf(", %s motorcycle\n", type);
    }
}