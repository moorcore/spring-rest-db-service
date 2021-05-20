package org.murkor.foodapp.rest.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.murkor.foodapp.rest.entity.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FoodDAOImpl implements FoodDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Food> getAllFood() {

        Session session = sessionFactory.getCurrentSession();

//        List<Employee> allEmployees = session.createQuery("from Employee",
//                Employee.class).getResultList();

        Query<Food> query = session.createQuery("from Food",
                Food.class);
        List<Food> allFood = query.getResultList();

        return allFood;
    }

    @Override
    public void saveFood(Food food) {
        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(food);
    }

    @Override
    public Food getAllFood(int id) {
        Session session = sessionFactory.getCurrentSession();

        return session.get(Food.class, id);
    }

    @Override
    public void deleteFood(int id) {
        Session session = sessionFactory.getCurrentSession();

        Query<Food> query = session.createQuery("delete from Food " +
                "where id = :foodId");

        query.setParameter("foodId", id);
        query.executeUpdate();
    }
}
