abstract class Vehicle {
    abstract void start();

    void stop() {
        System.out.println("Vehicle has stopped.");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key.");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with a button.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Car();   
        Vehicle v2 = new Bike();

        v1.start(); 
        v1.stop();  

        v2.start(); 
        v2.stop();  
    }
}

	

