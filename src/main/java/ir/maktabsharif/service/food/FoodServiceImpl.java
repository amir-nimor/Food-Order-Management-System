package ir.maktabsharif.service.food;

import ir.maktabsharif.model.Food;
import ir.maktabsharif.repository.food.FoodRepository;
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
    public Food findById(Long id) {
        return foodRepository.findById(id);
    }

    @Override
    public Long delete(Long id) {
        return foodRepository.delete(id);
    }
}
