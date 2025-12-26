// Encapsulation means wrapping data (variables) and methods together
// and restricting direct access to data using private access modifier.

class Vehicle3 {

    // PRIVATE VARIABLES → cannot be accessed directly from outside
    private String brand;
    private int speed;
    private boolean engineOn;

    // Public constructor
    public Vehicle3(String brand) {
        this.brand = brand;
        this.speed = 0;
        this.engineOn = false;
    }

    // GETTER → provides controlled read access
    public String getBrand() {
        return brand;
    }

    // SETTER → provides controlled write access with validation
    public void setBrand(String brand) {
        if (brand.length() < 2) {
            System.out.println("Brand name too short. Not allowed.");
        } else {
            this.brand = brand;
        }
    }

    // Encapsulation applied to speed variable
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        // Validation logic: speed cannot be negative
        if (speed < 0) {
            System.out.println("Speed cannot be negative.");
        } else {
            this.speed = speed;
        }
    }

    // Encapsulation allows us to hide complex logic inside methods
    public void startEngine() {
        engineOn = true;
        System.out.println(brand + " engine started.");
    }

    public void stopEngine() {
        engineOn = false;
        speed = 0;
        System.out.println(brand + " engine stopped.");
    }
}


// MAIN CLASS
public class Encapsulation2 {

    public static void main(String[] args) {

        // Creating an object
        Vehicle3 car = new Vehicle3("Tesla");

        // Accessing variables only through getters and setters
        System.out.println("Brand: " + car.getBrand());

        car.setSpeed(50);         // valid
        System.out.println("Speed: " + car.getSpeed());

        car.setSpeed(-10);        // invalid → validation runs

        car.startEngine();
        car.stopEngine();

        // Setting brand with validation
        car.setBrand("T");        // invalid
        car.setBrand("BMW");      // valid

        System.out.println("Updated Brand: " + car.getBrand());

        /*
            ENCAPSULATION CONCEPTS COVERED:

            1. Data hiding using private variables
            2. Controlled access through getters & setters
            3. Validation inside setters to protect data
            4. Methods controlling internal state (engineOn, speed)
            5. Avoiding direct modification of internal fields
            6. Cleaner and safer object design
        */
    }
}