# vehicle-management-System

A polymorphic system that manages different vehicle types (cars, trucks, motorcycles) using inheritance and an array of objects.

Key Features:
Inheritance Structure:

Vehicle (superclass) → Common properties (make, model, year)

Subclasses (Car, Truck, Motorcycle) → Extended with unique attributes (e.g., doors, payload, type).

Polymorphism:


An array of Vehicle objects holds different subclasses.

Each subclass overrides displayInfo() to show specialized details.

Unified Management:

All vehicles are stored in a single array.

Loop through the array to display customized info for each vehicle type.

Example Use Case:
Stores cars, trucks, and motorcycles in one array.

Displays details like:

Car: 2020 Toyota Camry (4-door)

Truck: 2019 Ford F-150 (Payload: 1.5 tons)

Motorcycle: 2021 Harley-Davidson Sportster (Cruiser)
