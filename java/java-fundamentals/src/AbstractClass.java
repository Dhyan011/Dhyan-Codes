// Abstract class: Cannot be instantiated directly.
// Used to provide a BASE structure for all subclasses.
abstract class Car {

    // ABSTRACT METHODS:
    // These methods have   NO BODY.
    // Subclasses MUST override and provide implementation.
    public abstract void drive();
    public abstract void fly();

    // CONCRETE METHOD:
    // A method with a body inside an abstract class.
    // Subclasses can use this directly without overriding.
    public void playMusic() {
        System.out.println("Playing music...");
    }

    /*
        NOTE:
        An abstract class can contain:
        1. Abstract methods
        2. Concrete methods
        3. Constructors (yes, allowed)
        4. Variables (instance + static)
        5. Final methods (cannot be overridden)

        But you CANNOT:
        - Create objects of an abstract class.
    */
}

// Subclass (Concrete Class):
// Must provide implementation for ALL abstract methods of Car.
class GWagon extends Car {

    @Override
    public void drive() {
        System.out.println("Driving the G-Wagon...");
    }

    @Override
    public void fly() {
        System.out.println("Flying the G-Wagon (imaginary mode)...");
    }

    /*
       NOTE:
       If even ONE abstract method is not overridden,
       this class must also be declared ABSTRACT.
     */
}

// MAIN CLASS (public so filename = AbstractClass.java)
public class AbstractClass {

    public static void main(String[] args) {

        // We cannot do: Car c = new Car();   // ERROR → Car is abstract.

        // Instead, we use dynamic polymorphism:
        Car obj = new GWagon();

        // Calls subclass methods
        obj.drive();
        obj.fly();

        // Calls concrete method from abstract class
        obj.playMusic();

        /*
          KEY CONCEPT:
          obj is of type Car (abstract class)
          but object is GWagon (subclass)
          → Runtime Polymorphism (Dynamic Method Dispatch)
        */
    }
}