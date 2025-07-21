package com.uevo.Fridge.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.uevo.Fridge.Repository.FoodRepository;
import com.uevo.Fridge.model.Food;

@Service
public class FoodService {
    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public List<Food> getAll() {
        return foodRepository.findAll();
    }

    public Food save(Food food) {
        return foodRepository.save(food);
    }

    public void delete(Long id) {
        foodRepository.deleteById(id);
    }

    public Food findById(Long id) {
        return foodRepository.findById(id).orElse(null);
    }
}
