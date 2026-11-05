package ir.maktabsharif.repository;

import ir.maktabsharif.model.Food;

import java.util.List;

public interface FoodRepository {

    void create(Food food);

    List<Food> findAll();

    Food findById(int id);

    int delete(int id);

}
