

public class HelloWorld {

    public static String getGreeting(String name) {
        if (name == null) throw new IllegalArgumentException();
        return "Hello, " + name;
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}