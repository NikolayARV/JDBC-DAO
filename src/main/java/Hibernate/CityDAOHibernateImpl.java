package Hibernate;

import modelHibernate.CityHibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class CityDAOHibernateImpl implements CityDAOHibernate {
    @Override
    public void add(CityHibernate city) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(city);
       // String jpqlQuery = "INSERT INTO city Values (?)";
        //
        //        TypedQuery<CityHibernate> query = entityManager.createQuery(jpqlQuery, CityHibernate.class);
        //        query.setParameter("1", city.getName());


        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();

    }

    @Override
    public CityHibernate getById(int id) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        String jpqlQuery = "select c from CityHibernate c where c.id =: a";
        TypedQuery<CityHibernate> query = entityManager.createQuery(jpqlQuery, CityHibernate.class);
        query.setParameter("a", id);
        CityHibernate city = query.getSingleResult();
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
        return city;
    }

    @Override
    public List<CityHibernate> getAllCities() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        String jpqlQuery = "select c from CityHibernate c";
        TypedQuery<CityHibernate> query = entityManager.createQuery(jpqlQuery, CityHibernate.class);
        List<CityHibernate> cityes = query.getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
        return cityes;
    }

    @Override
    public void deleteCity(CityHibernate city, int id) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        String jpqlQuery = "DELETE FROM CityHibernate c WHERE c.id =: d";

        TypedQuery<CityHibernate> query = entityManager.createQuery(jpqlQuery, CityHibernate.class);
        query.setParameter("d", id);

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }

    @Override
    public void updateCity(CityHibernate city, int id) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        String jpqlQuery = "UPDATE CityHibernate c SET name = (?) WHERE id =(?)";

        TypedQuery<CityHibernate> query = entityManager.createQuery(jpqlQuery, CityHibernate.class);
        query.setParameter("1", city.getName());
        query.setParameter("2", id);

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
