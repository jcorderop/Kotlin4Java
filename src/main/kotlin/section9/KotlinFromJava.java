package section9;

import section5.oop.EmployeeKotlinConst;
import section5.oop.EmployeeKotlinSimple;
import section5.oop.KotrlinStaticFun;
import section5.oop.MySingleton;

import java.io.IOException;

public class KotlinFromJava {
    public static void main(String[] args) {
        EmployeeKotlinSimple employeeKotlinSimple = new EmployeeKotlinSimple("Jorge", 2012);
        System.out.println(employeeKotlinSimple);
        System.out.println(employeeKotlinSimple.getFirstName());
        System.out.println(employeeKotlinSimple.startYear);
        employeeKotlinSimple.startYear = 2000;
        System.out.println(employeeKotlinSimple.startYear);

        KotrlinStaticFun.topLevel();

        KotrlinStaticFun.printExtensionFunction("something to print");

        //////////////////////////////

        //EmployeeKotlinSimple.Companion.employeeComp();
        EmployeeKotlinSimple.employeeComp();

        /////////////////////
        System.out.println(MySingleton.INSTANCE.getCopyRight());
        System.out.println(MySingleton.getTag());

        ///////////////////////
        System.out.println(EmployeeKotlinSimple.isEmployee);
        System.out.println(EmployeeKotlinSimple.isGood);

        ///////////////////////
        employeeKotlinSimple.printMe("Hallo");


        ///////////////////////
        try {
            employeeKotlinSimple.doIO();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ///////////////////////
        KotrlinStaticFun.defaultArgs("halo");
        KotrlinStaticFun.defaultArgs("halo", 42);


        //////////////////////////////
        EmployeeKotlinConst employeeKotlinConst = new EmployeeKotlinConst("Jorge");
        employeeKotlinConst.setFullTime(true);
        System.out.println(employeeKotlinConst);
    }
}
