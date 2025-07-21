package com.uevo.Fridge.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uevo.Fridge.model.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {
    
}
