package ir.maktabsharif.repository.food;

import ir.maktabsharif.model.Food;

import java.util.List;

public interface FoodRepository {

    void create(Food food);

    List<Food> findAll();

    Food findById(Long id);

    Long delete(Long id);

}
