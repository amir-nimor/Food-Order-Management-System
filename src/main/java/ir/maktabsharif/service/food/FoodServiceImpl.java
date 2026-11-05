package ir.maktabsharif.service;

import ir.maktabsharif.model.Food;
import ir.maktabsharif.repository.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService{

    private final FoodRepository foodRepository;

    public FoodServiceImpl(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }


    @Override
    public void create(Food food) {
        foodRepository.create(food);
    }

    @Override
    public List<Food> findAll() {
        return foodRepository.findAll();
    }

    @Override
    public Food findById(int id) {
        return foodRepository.findById(id);
    }

    @Override
    public int delete(int id) {
        return foodRepository.delete(id);
    }
}
