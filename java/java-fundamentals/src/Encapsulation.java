// Encapsulation = keeping data private + accessing it through getters/setters
class Human {
    // Data is private (cannot be accessed directly)
    private int age;
    private String name;

    // Public getter methods → only way to read data
    public int getAge() { return age; }
    public String getName() { return name; }

    // Public setter methods → only way to modify data
    public void setAge(int a) { age = a; }
    public void setName(String n) { name = n; }
}

public class Encapsulation {
    public static void main(String[] a) {

        Human obj = new Human();

        // Using setters instead of direct access → encapsulation in action
        obj.setAge(42);
        obj.setName("bhadresh");

        // Using getters to safely access private data
        System.out.println("Age of " + obj.getName() + " is " + obj.getAge());
    }
}