package Hibernate;

import modelHibernate.EmployeeHibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class EmployeeDAOImplHibernate implements EmployeeDAOHibernate {
    final String user = "postgres";
    final String password = "Zxc13579";
    final String url = "jdbc:postgresql://localhost:5432/skypro";

    @Override
    public List<EmployeeHibernate> getAllEmployes() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        String jpqlQuery = "select e from EmployeeHibernate e";
        TypedQuery<EmployeeHibernate> query = entityManager.createQuery(jpqlQuery, EmployeeHibernate.class);
        List<EmployeeHibernate> employeeHibernates = query.getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
        return employeeHibernates;
    }

    @Override
    public EmployeeHibernate getEmployeeById(int id) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        String jpqlQuery = "select e from EmployeeHibernate e where e.id =: a";
        TypedQuery<EmployeeHibernate> query = entityManager.createQuery(jpqlQuery, EmployeeHibernate.class);
        query.setParameter("a", id);
        EmployeeHibernate employeeHibernate = query.getSingleResult();
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
        return employeeHibernate;
    }

    @Override
    public void createEmployee(EmployeeHibernate employeeHibernate) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(employeeHibernate);


        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();

    }

    @Override
    public void updateEmployee(EmployeeHibernate employeeHibernate, int id) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        String jpqlQuery = "UPDATE EmployeeHibernate e SET name =:n, lastname =:l, gender =:g, age =:a, city =:c WHERE e.id =:d";

        entityManager.createQuery(jpqlQuery)
                        .setParameter("n", employeeHibernate.getName())
                        .setParameter("l", employeeHibernate.getLastname())
                        .setParameter("g", employeeHibernate.getGender())
                        .setParameter("a", employeeHibernate.getAge())
                        .setParameter("c", employeeHibernate.getCity())
                        .setParameter("d", id)
                      .executeUpdate();



        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }

    @Override
    public void deleteEmployee(int id) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        String jpqlQuery = "DELETE FROM EmployeeHibernate e WHERE e.id =: d";

        TypedQuery<EmployeeHibernate> query = entityManager.createQuery(jpqlQuery, EmployeeHibernate.class);
        query.setParameter("d", id);

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
