import Hibernate.CityDAOHibernate;
import Hibernate.CityDAOHibernateImpl;
import Hibernate.EmployeeDAOHibernate;
import Hibernate.EmployeeDAOImplHibernate;
import modelHibernate.CityHibernate;
import modelHibernate.EmployeeHibernate;

import java.util.List;

public class testHibernate2 {
    public static void main(String[] args) {
        EmployeeDAOHibernate employeeDAOHibernate = new EmployeeDAOImplHibernate();
        CityDAOHibernate cityDAOHibernate = new CityDAOHibernateImpl();
        CityHibernate city1 = new CityHibernate("Vnukovo");
        EmployeeHibernate empl1 = new EmployeeHibernate("Gena", "Vanin", "m", 52, city1);
        EmployeeHibernate empl2 = new EmployeeHibernate("Nana", "Vanina", "f", 25, city1);
        EmployeeHibernate empl3 = new EmployeeHibernate("Dana", "Petin", "m", 32, city1);
        EmployeeHibernate empl4 = new EmployeeHibernate("Lida", "Petina", "f", 42, city1);
       // cityDAOHibernate.add(city1);
        employeeDAOHibernate.createEmployee(empl1);
        employeeDAOHibernate.createEmployee(empl2);
        employeeDAOHibernate.createEmployee(empl3);
        employeeDAOHibernate.createEmployee(empl4);



        }


    }

