// Base class Bike
class Bike {
    
    int speedlimit = 90;
    
    
    void run() {
        System.out.println("Bike is running. Speed limit is " + speedlimit + " km/h.");
    }
}


class Splendar extends Bike {
    
    int speedlimit = 60;
    
    // Overriding the run method in Splendar
    @Override
    void run() {
        System.out.println("Splendar is running. Speed limit is " + speedlimit + " km/h.");
    }
}

// Main class to test runtime polymorphism
public class BikeE {
    public static void main(String[] args) {
        // Reference of Bike, object of Bike
        Bike bike = new Bike();
        bike.run();  // Output: Bike's run method
        
        // Reference of Bike, object of Splendar
        Bike splendar = new Splendar();
        splendar.run();  // Output: Splendar's run method (runtime polymorphism for methods)
        
        // Checking the speed limit field using the reference type
        System.out.println("Speed limit accessed via Bike reference to Splendar object: " + splendar.speedlimit + " km/h");
    }
}
