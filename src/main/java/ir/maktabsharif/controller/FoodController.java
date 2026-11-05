package ir.maktabsharif.controller;

import ir.maktabsharif.service.food.FoodService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/food")
public class FoodController {

    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;

    }


    @RequestMapping("/all")
    public String menu(Model model) {
        model.addAttribute("foods",foodService.findAll());
        return "foods";
    }
}
