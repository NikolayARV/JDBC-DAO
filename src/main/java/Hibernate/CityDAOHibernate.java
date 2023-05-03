package Hibernate;

import model.City;
import modelHibernate.CityHibernate;

import java.util.List;

public interface CityDAOHibernate {
    void add (CityHibernate city);

    CityHibernate getById(int id);
    List<CityHibernate> getAllCities();



    void deleteCity(CityHibernate city, int id);

    void updateCity(CityHibernate city, int id);
}
