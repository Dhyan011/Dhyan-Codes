class Cat {
    public Cat(){
        System.out.println("object created");
    }

    public void show (){
        System.out.println("in G show ");
    }
}

public class AnonymousObj {
    public static void main (String[] arg)
    {

        // Anonymous Object = object without reference (one-time use)
        // Can't reuse it later; good for quick method calls

        new Cat().show(); // creates object + immediately uses it

    }
}