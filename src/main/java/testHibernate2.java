import Hibernate.CityDAOHibernate;
import Hibernate.CityDAOHibernateImpl;
import Hibernate.EmployeeDAOHibernate;
import Hibernate.EmployeeDAOImplHibernate;
import modelHibernate.CityHibernate;
import modelHibernate.EmployeeHibernate;

public class testHibernate2 {
    public static void main(String[] args) {
        EmployeeDAOHibernate employeeDAOHibernate = new EmployeeDAOImplHibernate();
        CityDAOHibernate cityDAOHibernate = new CityDAOHibernateImpl();
        CityHibernate city1 = new CityHibernate("Vnukovo");
        EmployeeHibernate empl1 = new EmployeeHibernate("Gena", "Vanin", "m", 52, city1);

        // cityDAOHibernate.add(city1);
        CityHibernate city2 = new CityHibernate("Kotlin");
        //cityDAOHibernate.add(city2);
        EmployeeHibernate empl2 = new EmployeeHibernate("Nana", "Vanina", "f", 25, city2);
        EmployeeHibernate empl3 = new EmployeeHibernate("Dana", "Petin", "m", 32, city2);
        EmployeeHibernate empl4 = new EmployeeHibernate("Lida", "Petina", "f", 42, city2);
        EmployeeHibernate empl5 = new EmployeeHibernate("Lada", "Getina", "f", 42, city2);
        //employeeDAOHibernate.createEmployee(empl5);
        //employeeDAOHibernate.createEmployee(empl2);
        //employeeDAOHibernate.createEmployee(empl3);
        //employeeDAOHibernate.createEmployee(empl4);
        EmployeeHibernate empl6 = new EmployeeHibernate("Luna", "Vatutina", "f", 42, city2);
        employeeDAOHibernate.updateEmployee(empl6, 26);
        //employeeDAOHibernate.deleteEmployee(24);


    }


}

