import Hibernate.EmployeeDAOHibernate;
import Hibernate.EmployeeDAOImplHibernate;
import modelHibernate.EmployeeHibernate;

import java.util.List;

public class testHibernate {
    public static void main(String[] args) {
        EmployeeDAOHibernate employeeDAOHibernate = new EmployeeDAOImplHibernate();
        List<EmployeeHibernate> employeeHibernates= employeeDAOHibernate.getAllEmployes();
        for (EmployeeHibernate employeeHibernate : employeeHibernates) {
            System.out.println(employeeHibernate.getId());
            System.out.println(employeeHibernate.getName());
            System.out.println(employeeHibernate.getLastname());
            System.out.println(employeeHibernate.getGender());
            System.out.println(employeeHibernate.getAge());
            System.out.println(employeeHibernate.getCity());

            System.out.println(employeeDAOHibernate.getEmployeeById(14));

        }


    }
}
