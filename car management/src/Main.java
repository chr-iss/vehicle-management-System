//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

        public static void main(String[] args) {
            Vehicle[] garage = new Vehicle[5];
            garage[0] = new Car("Toyota", "Camry", 2020, 4);
            garage[1] = new Truck("Ford", "F-150", 2019, 1.5);
            garage[2] = new Motorcycle("Harley-Davidson", "Sportster", 2021, "Cruiser");
            garage[3] = new Car("Honda", "Civic", 2022, 2);
            garage[4] = new Truck("Chevrolet", "Silverado", 2020, 2.0);

            System.out.println("Garage Inventory:");
            for (Vehicle vehicle : garage) {
                vehicle.displayInfo();
            }
        }
    }
