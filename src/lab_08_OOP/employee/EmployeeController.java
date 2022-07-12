package lab_08_OOP.employee;

import java.util.Arrays;
import java.util.List;

public class EmployeeController {

    public static void main(String[] args) {
        Employee ti1 = new FullTimeEmployee();
        Employee ti2 = new FullTimeEmployee();
        Employee ti3 = new FullTimeEmployee();
        Employee teo1 = new ContractEmployee();
        Employee teo2 = new ContractEmployee();

        System.out.println(calcSalary(Arrays.asList(ti1, ti2, ti3, teo1, teo2)));

    }

    public static float calcSalary(List<Employee> employeeList){
        float total =0.0f;
        for (Employee employee : employeeList) {
            total += employee.getSalary();
        }
        return total;
    }
}
