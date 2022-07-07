package lab_12_interface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeController {

    public static void main(String[] args) {
        Employee ti = new Employee("ti", 5);
        Employee teo = new Employee("teo", 3);
        Employee tun = new Employee("tun", 10);

        List<Employee> employeeList = Arrays.asList(ti,teo,tun);

        Collections.sort(employeeList);
        System.out.println(employeeList);
    }


}
