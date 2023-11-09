package pro.sky.java.course2;

import pro.sky.java.course2.model.Employee;
import pro.sky.java.course2.service.EmployeeServiceName;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("ваня","uid");
        EmployeeServiceName name = new EmployeeServiceName(employee);

        System.out.println(name.checkName(employee));
    }
}