package DAY7ASSIGNMENT5;
abstract class Vehicle{
    abstract void vehiclesPerformance();

    void startVehicle(){
        System.out.println("Engine started");
    }
}

class car extends Vehicle {
    void vehiclesPerformance(){
        System.out.println("Car performance is best");
    }
}

class Bike extends Vehicle{
    void vehiclesPerformance(){
        System.out.println("Bike's mileage is best");
    }
}

public class Task1 {
    public static void main(String[] args) {
        Vehicle car = new car();
        car.startVehicle();
        car.vehiclesPerformance();

System.out.println();
        
        Vehicle bike =new Bike();
        bike.startVehicle();
        bike.vehiclesPerformance();
    }
}
