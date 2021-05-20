package org.murkor.foodapp.rest.service;

import org.murkor.foodapp.rest.dao.FoodDAO;
import org.murkor.foodapp.rest.entity.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodDAO foodDAO;

    @Override
    @Transactional
    public List<Food> getAllFood() {
        return foodDAO.getAllFood();
    }

    @Override
    @Transactional
    public void saveFood(Food food) {
        foodDAO.saveFood(food);
    }

    @Override
    @Transactional
    public Food getFood(int id) {
        return foodDAO.getAllFood(id);
    }

    @Override
    @Transactional
    public void deleteFood(int id) {
        foodDAO.deleteFood(id);
    }
}
