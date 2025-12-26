// BASE CLASS (Parent Class)
// Demonstrates fields, constructors, and methods inherited by subclasses.
class Vehicle2 {

    protected String brand;
    static int vehicleCount = 0;

    // Parent constructor
    public Vehicle2(String brand) {
        this.brand = brand;
        vehicleCount++;
    }

    public void startEngine() {
        System.out.println(brand + " Vehicle3 engine starting...");
    }

    public void stopEngine() {
        System.out.println(brand + " Vehicle3 engine stopping...");
    }

    public void showBrand() {
        System.out.println("Brand: " + brand);
    }

    public final void vehicleInfo() {
        System.out.println("This belongs to the Vehicle3 family.");
    }
}


// SUBCLASS 1 → Bike2 inherits from Vehicle3
class Bike2 extends Vehicle2 {

    public Bike2(String brand) {
        super(brand); // Calls Vehicle3 constructor
    }

    // Method overriding
    @Override
    public void startEngine() {
        System.out.println(brand + " Bike2 engine starting...");
    }

    @Override
    public void stopEngine() {
        System.out.println(brand + " Bike2 engine stopping...");
    }
}


// SUBCLASS 2 → FlyingCar2 inherits from Vehicle3
class FlyingCar2 extends Vehicle2 {

    public FlyingCar2(String brand) {
        super(brand);
    }

    @Override
    public void startEngine() {
        System.out.println(brand + " FlyingCar2 engine starting...");
    }

    @Override
    public void stopEngine() {
        System.out.println(brand + " FlyingCar2 engine stopping...");
    }

    // Extra child-specific method
    public void fly() {
        System.out.println(brand + " FlyingCar2 is flying...");
    }
}


// SUBCLASS 3 → TeslaFlyingCar2 inherits from FlyingCar2
class TeslaFlyingCar2 extends FlyingCar2 {

    public TeslaFlyingCar2() {
        super("Tesla");
    }

    // Overriding fly() again to show multi-level inheritance behavior
    @Override
    public void fly() {
        System.out.println("Tesla FlyingCar2 flying with autopilot...");
    }
}


// MAIN CLASS
public class Inheritance2 {

    public static void main(String[] args) {

        // ====== Single Inheritance Example ======
        Vehicle2 bike = new Bike2("Yamaha");
        bike.showBrand();
        bike.startEngine();
        bike.stopEngine();
        bike.vehicleInfo();

        System.out.println();


        // ====== Multilevel Inheritance Example ======
        Vehicle2 car = new TeslaFlyingCar2(); // Vehicle3 → FlyingCar2 → TeslaFlyingCar2

        car.showBrand();
        car.startEngine();
        car.stopEngine();
        car.vehicleInfo();

        System.out.println();

        // Using subclass reference to access child-specific methods
        TeslaFlyingCar2 tfc = new TeslaFlyingCar2();
        tfc.showBrand();
        tfc.startEngine();
        tfc.fly();           // child-specific method
        tfc.stopEngine();

        System.out.println();

        // Static variable demonstration
        System.out.println("Total vehicles created: " + Vehicle2.vehicleCount);

        /*
            Concepts Covered:

            1. Single inheritance  (Vehicle3 → Bike2)
            2. Multilevel inheritance  (Vehicle3 → FlyingCar2 → TeslaFlyingCar2)
            3. Method overriding
            4. Using super() to call parent constructor
            5. Polymorphism through parent reference
            6. Inheriting fields and methods
            7. Final method (cannot be overridden)
            8. Child-specific methods (fly())
            9. Static variable inheritance
        */
    }
}