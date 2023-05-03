package Hibernate;

import model.Employee;
import modelHibernate.EmployeeHibernate;

import java.util.List;

public interface EmployeeDAOHibernate {
    List<EmployeeHibernate> getAllEmployes();
    EmployeeHibernate getEmployeeById(int id);
    void createEmployee(EmployeeHibernate employeeHibernate);


    void updateEmployee(EmployeeHibernate employeeHibernate, int id);

    void deleteEmployee(int id);
}
