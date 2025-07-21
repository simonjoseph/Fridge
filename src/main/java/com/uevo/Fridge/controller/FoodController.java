package com.uevo.Fridge.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uevo.Fridge.model.Food;
import com.uevo.Fridge.service.FoodService;

@RestController
@RequestMapping("/food")
public class FoodController {

    // Injeção de dependência do FoodService
    private final FoodService foodService;

    // Construtor para injeção de dependência ou Autowired
    // @Autowired é opcional se houver apenas um construtor
    // e o Spring irá injetar automaticamente a dependência.
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping
    public List<Food> getAll() {return foodService.getAll();}

    @PostMapping
    public Food create(@RequestBody Food food) {
        return foodService.save(food);
    }
}
