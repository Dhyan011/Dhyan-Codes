// FILE: StaticConcepts.java

public class StaticConcepts {

    // 1. STATIC VARIABLE (shared among all objects)
    static int sharedCounter = 0;

    // 2. INSTANCE VARIABLE (unique for each object)
    int objectId;

    // 3. STATIC FINAL (constant)
    static final double PI = 3.14159;

    // 4. STATIC BLOCK (runs once when class loads)
    static {
        System.out.println("Static Block: Class loaded.");
        sharedCounter = 100;
    }

    // 5. INSTANCE INITIALIZER (runs before each constructor call)
    {
        System.out.println("Instance Initializer: Creating a new object.");
    }

    // Constructor
    StaticConcepts(int id) {
        this.objectId = id;
        sharedCounter++; // increments static variable
    }

    // 6. STATIC METHOD
    static void showSharedCounter() {
        System.out.println("Static Method → sharedCounter = " + sharedCounter);
    }

    // 7. INSTANCE METHOD
    void showDetails() {
        System.out.println("Object ID = " + objectId);
        System.out.println("Shared Counter = " + sharedCounter);
        System.out.println("PI Constant = " + PI);
    }

    // 8. STATIC NESTED CLASS
    static class NestedStaticClass {
        void display() {
            System.out.println("Nested Static Class → Can access sharedCounter = " + sharedCounter);
        }
    }

    // ===============================================================
    // 9. STATIC METHOD HIDING (NOT OVERRIDING)
    // ===============================================================

    static class Parent {
        static void greet() {
            System.out.println("Parent greet()");
        }
    }

    static class Child extends Parent {
        static void greet() {
            System.out.println("Child greet()  (method hiding)");
        }
    }

    // ===============================================================
    // 10. STATIC + INHERITANCE (variables are NOT inherited per-object)
    // ===============================================================


    public static void main(String[] args) {

        System.out.println("=== Program Started ===");
        StaticConcepts.showSharedCounter();

        // Creating objects
        StaticConcepts obj1 = new StaticConcepts(1);
        StaticConcepts obj2 = new StaticConcepts(2);

        // Calling instance methods
        obj1.showDetails();
        obj2.showDetails();

        // Call static method
        StaticConcepts.showSharedCounter();

        // Using STATIC NESTED CLASS
        NestedStaticClass nested = new NestedStaticClass();
        nested.display();

        System.out.println("\n=== Static Method Hiding Demo ===");
        Parent.greet(); // Parent's static method
        Child.greet();  // Child's static method (hiding, not overriding)

        System.out.println("\n=== End of Demo ===");
    }
}