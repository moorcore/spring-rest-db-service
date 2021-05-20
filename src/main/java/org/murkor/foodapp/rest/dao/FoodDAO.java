package org.murkor.foodapp.rest.dao;

import org.murkor.foodapp.rest.entity.Food;

import java.util.List;

public interface FoodDAO {

    public List<Food> getAllFood();

    public void saveFood(Food food);

    public Food getAllFood(int id);

    public void deleteFood(int id);
}
