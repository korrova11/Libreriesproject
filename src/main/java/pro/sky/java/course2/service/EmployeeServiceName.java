package pro.sky.java.course2.service;

import pro.sky.java.course2.exception.BadRequestException;
import pro.sky.java.course2.model.Employee;

import static org.apache.commons.lang3.StringUtils.capitalize;
import static org.apache.commons.lang3.StringUtils.containsNone;

public class EmployeeServiceName {
    Employee employee;

    public EmployeeServiceName(Employee employee) {
        this.employee = employee;
    }

    public Employee checkName(Employee emp) {
        if ((containsNone(emp.getFirstName(), "1234567890!№;%:?*()_+-=.,><|"))
                && (containsNone(emp.getLastName(), "1234567890!№;%:?*()_+-=.,><|"))) {
            emp.setFirstName(capitalize(emp.getFirstName()));
            emp.setLastName(capitalize(emp.getLastName()));

            return emp;
        } else {
            throw new BadRequestException("Неправильное имя");

        }
    }
}
