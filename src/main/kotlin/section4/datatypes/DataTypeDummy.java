package section4.datatypes;

import java.util.Arrays;

public class DataTypeDummy {

    public String isVacation(boolean onVacations) {
        return onVacations ? "I am on vacation" : "I am working";
    }

    public void pringSomethingFromArray(int [] something) {
        Arrays.stream(something).forEach(System.out::println);
    }

}
