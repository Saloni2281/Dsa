interface Vehicle {
    void start();  
    void stop();   
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with a key.");
    }

    public void stop() {
        System.out.println("Car stops with brakes.");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike starts with a button.");
    }

    public void stop() {
        System.out.println("Bike stops by pressing the lever.");
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
