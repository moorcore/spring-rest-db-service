package org.murkor.foodapp.rest.controller;

import org.murkor.foodapp.rest.entity.Food;
import org.murkor.foodapp.rest.exception_handling.NoSuchFoodException;
import org.murkor.foodapp.rest.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {

    @Autowired
    private FoodService foodService;

    @GetMapping("/foods")
    public List<Food> showAllEmployees() {
        return foodService.getAllFood();
    }

    @GetMapping("/foods/{id}")
    public Food getFood(@PathVariable int id) {

        Food food = foodService.getFood(id);

        if (food == null) {
            throw new NoSuchFoodException("There is no food with ID = " +
                    id + " in Database");
        }

        return food;
    }

    @PostMapping("/foods")
    public Food addNewFood(@RequestBody Food food) {

        foodService.saveFood(food);

        return food;
    }

    @PutMapping("/foods")
    public Food updateEmployee(@RequestBody Food food) {
        foodService.saveFood(food);

        return food;
    }

    @DeleteMapping("/foods/{id}")
    public String deleteFood(@PathVariable int id) {
        Food food = foodService.getFood(id);
        if (food == null) {
            throw new NoSuchFoodException("There is no food with ID = " +
                    id + " in Database");
        }

        foodService.deleteFood(id);

        return "Food with ID = " + id + " was deleted.";
    }
}
