public class StringConcepts {

    public static void main(String[] args) {

        System.out.println("=== STRING (Immutable) ===");

        // String is immutable → cannot be changed after creation
        String s1 = "Dhyan";
        System.out.println("Original String: " + s1);

        // This does NOT change s1. It creates a NEW string
        s1 = s1 + " Patel";
        System.out.println("After concatenation: " + s1);


        System.out.println("\n=== STRINGBUFFER (Mutable + Thread-Safe) ===");

        // StringBuffer is mutable → changes happen in the same object
        // Thread-safe → slower but safe in multi-threaded programs
        StringBuffer sb = new StringBuffer("Dhyan");
        sb.append(" Patel");
        System.out.println("After append(): " + sb);

        sb.reverse();
        System.out.println("After reverse(): " + sb);

        // convert to String
        String sbToString = sb.toString();
        System.out.println("Converted to String: " + sbToString);


        System.out.println("\n=== STRINGBUILDER (Mutable + Fast) ===");

        // StringBuilder is mutable → but NOT thread-safe → fastest
        StringBuilder sbd = new StringBuilder("Dhyan");
        sbd.append(" Patel");
        System.out.println("After append(): " + sbd);

        sbd.insert(6, " Kumar");
        System.out.println("After insert(): " + sbd);

        sbd.delete(0, 5);
        System.out.println("After delete(): " + sbd);


        System.out.println("\n=== IMMUTABILITY DEMO ===");

        String strA = "hello";
        String strB = strA;

        strA = strA + " world";

        System.out.println("strA: " + strA);
        System.out.println("strB (unchanged): " + strB);
        // shows that String creates a NEW object every time


        System.out.println("\n=== BUFFER vs BUILDER SPEED IDEA ===");

        // No actual speed test, but concept:
        System.out.println("StringBuffer = Thread Safe (Slow)");
        System.out.println("StringBuilder = Not Thread Safe (Fast)");
    }
}