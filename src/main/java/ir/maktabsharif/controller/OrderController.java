package ir.maktabsharif.controller;

import ir.maktabsharif.model.Food;
import ir.maktabsharif.model.Order;
import ir.maktabsharif.service.food.FoodService;
import ir.maktabsharif.service.order.OrderService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;
    private final FoodService foodService;

    public OrderController(OrderService orderService, FoodService foodService) {
        this.orderService = orderService;
        this.foodService = foodService;
    }

    @RequestMapping("/all")
    public String findAllOrder(Model model){
        model.addAttribute("orders",orderService.findAll());
        return "orders";
    }


    @GetMapping("/add")
    public String getForm(Model model) {
        model.addAttribute("foods",foodService.findAll());
        return "orderForm";
    }

    @PostMapping("/add")
//    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> addOrder(
            @RequestParam("customerName") String customerName,
            @RequestParam("quantity") Integer quantity,
            @RequestParam("foodId") Long foodId
    ) {
        Food food = foodService.findById(foodId);
        Order order = Order.builder().customerName(customerName).quantity(quantity).food(food).build();
        orderService.create(order);
//        ResponseEntity response = new ResponseEntity<>(HttpStatus.OK);
//        response.getHeaders().add("application/json");
//        return ResponseEntity.status(HttpServletResponse.SC_OK).build();
        return ResponseEntity.status(HttpStatus.CREATED).header("message","order created").body("create a order");
    }


}
