package lab_12_interface;

public class Employee implements Comparable<Employee> {

    private String name;
    private int age;

    Employee(){}

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Employee that) {
        return this.age - that.getAge();
    }
}
