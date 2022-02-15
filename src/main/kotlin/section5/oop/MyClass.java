package section5.oop;

interface MyJavaInterface {

    void printSomething();

}

public class MyClass implements MyJavaInterface {
    public static void main(String[] args) {
        new MyClass().printSomething();
    }

    @Override
    public void printSomething() {
        System.out.println("Printing something");
    }
}
