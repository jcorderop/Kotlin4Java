package section9;

import java.util.Arrays;

public class Car {

    public static final String constant = "Const";
    public static String getConstant() {
        return constant;
    }

    private String model;
    private String color;
    private int year;
    private Object anObject;

    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.anObject = new Object();
    }

    public Object getAnObject() {
        return anObject;
    }

    public void demoThread () {

        new Thread(() -> System.out.println("I am in a lambda thread")).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I am in a thread");
            }
        }).start();
    }

    public void demoThread (Runnable r) {
        new Thread(r).start();
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    public void variableMethod(int num, String ... strings) {
        Arrays.stream(strings).forEach(System.out::println);
    }

    public void wantsInts(int [] ints) {
        Arrays.stream(ints).forEach(System.out::println);
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
