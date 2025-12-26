// Java does NOT support multiple inheritance with classes.
// But it supports it using interfaces.

interface A {
    void showA();
}

interface G {
    void showV();
}

// Class C inherits behaviour from BOTH A and G
class C implements A, G {

    public void showA() {
        System.out.println("from A");
    }

    public void showV() {
        System.out.println("from G");
    }
}

public class MultiInheritance {
    public static void main(String[] args) {

        C obj = new C();
        obj.showA();
        obj.showV();
    }
}