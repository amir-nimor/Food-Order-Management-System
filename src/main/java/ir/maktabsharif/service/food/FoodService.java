package ir.maktabsharif.service;

import ir.maktabsharif.model.Food;

import java.util.List;

public interface FoodService {


    void create(Food food);

    List<Food> findAll();

    Food findById(int id);

    int delete(int id);
}
