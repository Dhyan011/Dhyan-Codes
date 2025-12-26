// Parent class (superclass)
class Calc {
    // Basic operations
    public int add(int a, int b) { return a + b; }
    public int sub(int a, int b) { return a - b; }
}

// Child class (subclass)
class AdvCalc extends Calc {
    // Extra operations added by child
    public int mul(int a, int b) { return a * b; }
    public int div(int a, int b) { return a / b; }
}

public class Inheritance {
    public static void main(String[] args) {

        // Child object can use BOTH:
        // 1. Parent class methods (add, sub)
        // 2. Its own methods (mul, div)
        // This is inheritance in action.
        AdvCalc calc = new AdvCalc();

        int r1 = calc.add(10, 5);   // from parent
        int r2 = calc.sub(10, 5);   // from parent
        int r3 = calc.mul(10, 5);   // from child
        int r4 = calc.div(10, 5);   // from child

        System.out.println("Add: " + r1);
        System.out.println("Sub: " + r2);
        System.out.println("Mul: " + r3);
        System.out.println("Div: " + r4);
    }
}