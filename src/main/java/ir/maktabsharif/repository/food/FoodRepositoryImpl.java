package ir.maktabsharif.repository.food;

import ir.maktabsharif.model.Food;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FoodRepositoryImpl implements FoodRepository{

    private static final List<Food> FOODS = new ArrayList<Food>();

    static {
        FOODS.add(new Food(1L,"pizaa1","food",120));
        FOODS.add(new Food(2L,"pizaa2","foyujkod",145));
        FOODS.add(new Food(3L,"pizaa3","foo752d",6385));
        FOODS.add(new Food(4L,"pizaa4","footyud",85));
    }

    @Override
    public void create(Food food) {
        if(food.getId()==null){
            food.setId(FOODS.size()+1L);
        }

        FOODS.add(food);
    }

    @Override
    public List<Food> findAll() {
        return FOODS;
    }

    @Override
    public Food findById(Long id) {
        return FOODS.stream().filter(food -> food.getId() == id).findFirst().orElse(null);
    }


    @Override
    public Long delete(Long id) {
        FOODS.remove(FOODS.stream().filter(food -> food.getId() == id).findFirst().get());
        return id;
    }
}
