package ir.maktabsharif.service.food;

import ir.maktabsharif.model.Food;

import java.util.List;

public interface FoodService {


    void create(Food food);

    List<Food> findAll();

    Food findById(Long id);

    Long delete(Long id);
}
