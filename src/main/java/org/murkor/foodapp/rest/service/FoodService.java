package org.murkor.foodapp.rest.service;

import org.murkor.foodapp.rest.entity.Food;

import java.util.List;

public interface FoodService {
    public List<Food> getAllFood();

    public void saveFood(Food food);

    public Food getFood(int id);

    public void deleteFood(int id);
}
