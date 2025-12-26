// BASE ABSTRACT CLASS
// Demonstrates abstract methods, concrete methods, variables, and constructors.
abstract class Vehicle {

    // Instance variable (inherited by subclasses)
    protected String brand;

    // Static variable (shared among all vehicles)
    static int vehicleCount = 0;

    // Constructor inside an abstract class
    // Abstract classes CAN have constructors but cannot be instantiated directly.
    public Vehicle(String brand) {
        this.brand = brand;
        vehicleCount++;
    }

    // ABSTRACT METHOD:
    // Must be implemented by subclasses.
    public abstract void startEngine();

    // ABSTRACT METHOD:
    // Shows that multiple abstract methods can exist.
    public abstract void stopEngine();

    // CONCRETE METHOD:
    // Subclasses can use this method directly.
    public void showBrand() {
        System.out.println("Brand: " + brand);
    }

    // FINAL METHOD:
    // Cannot be overridden by subclasses.
    public final void vehicleInfo() {
        System.out.println("This vehicle belongs to the abstract Vehicle3 family.");
    }
}


// SUBCLASS 1: Complete implementation → becomes a concrete class
class Bike extends Vehicle2 {

    public Bike(String brand) {
        super(brand); // Calling abstract class constructor
    }

    @Override
    public void startEngine() {
        System.out.println(brand + " Bike2 engine starting...");
    }

    @Override
    public void stopEngine() {
        System.out.println(brand + " Bike2 engine stopping...");
    }
}


// SUBCLASS 2: Partial implementation → must also be abstract
// Demonstrates that if you don't override all abstract methods, the class must stay abstract.
abstract class FlyingCar extends Vehicle2 {

    public FlyingCar(String brand) {
        super(brand);
    }

    @Override
    public void startEngine() {
        System.out.println(brand + " FlyingCar2 engine starting...");
    }

    // stopEngine() NOT implemented → class must remain abstract
    // This demonstrates partial implementation behavior.
}


// SUBCLASS 3: Concrete flying car that completes the implementation
class TeslaFlyingCar extends FlyingCar2 {

    public TeslaFlyingCar() {
        super("Tesla");
    }

    @Override
    public void stopEngine() {
        System.out.println("Tesla FlyingCar2 engine shutting down...");
    }
}


// MAIN CLASS
public class AbstractClass2 {

    public static void main(String[] args) {

        // Demonstrating concrete subclass object
        Vehicle2 bike = new Bike2("Yamaha");

        bike.showBrand();
        bike.startEngine();
        bike.stopEngine();
        bike.vehicleInfo();  // final method

        System.out.println();

        // Demonstrating dynamic polymorphism using abstract reference
        Vehicle2 flyCar = new TeslaFlyingCar2();

        flyCar.showBrand();
        flyCar.startEngine();
        flyCar.stopEngine();  // completed implementation
        flyCar.vehicleInfo();

        System.out.println();

        // Static variable demonstration
        System.out.println("Total vehicles created: " + Vehicle2.vehicleCount);

        /*
            IMPORTANT CONCEPTS DEMONSTRATED:

            1. Abstract class with both abstract + concrete methods
            2. Abstract class constructor
            3. Abstract + concrete subclass
            4. Partial implementation (FlyingCar2 is abstract)
            5. Final method inside abstract class
            6. Static variables inside abstract class
            7. Dynamic polymorphism using abstract reference
            8. Why abstract classes cannot be instantiated directly
        */
    }
}