import DAO.EmployeeDAO;
import DAO.EmployeeDAOImpl;
import model.Employee;

import java.util.List;

public class TestDAO {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        List<Employee> employeeList = employeeDAO.getAllEmployes();

        for (Employee employee : employeeList) {
            System.out.println(employee.getId());
            System.out.println(employee.getName());
            System.out.println(employee.getLastname());
            System.out.println(employee.getGender());
            System.out.println(employee.getAge());
            System.out.println(employee.getCityId());

        }
        System.out.println(employeeDAO.getEmployeeById(9));
        Employee employee1 = new Employee("Gena", "Krokodil", "m", 29, 5);
        //employeeDAO.createEmployee(employee1);
        Employee employee2 = new Employee("Gena", "Aligator", "m", 29, 5);
        //employeeDAO.updateEmployee(employee2, 14);
        //employeeDAO.deleteEmployee(13);


    }
}
