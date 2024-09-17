// Define the class
public class MyClass {

    // This is the main method
    public static void main(String[] args) {
        // Print a message to the console
        System.out.println("Hello, World!");

        // Creating an instance of MyClass
        MyClass obj = new MyClass();
        obj.sayHello("User");
    }

    // A method that prints a personalized greeting
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
