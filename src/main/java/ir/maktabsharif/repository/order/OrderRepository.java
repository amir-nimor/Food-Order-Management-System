package ir.maktabsharif.repository.order;

import ir.maktabsharif.model.Food;
import ir.maktabsharif.model.Order;

import java.util.List;

public interface OrderRepository {
    void create(Order order);

    List<Order> findAll();

    Order findById(Long id);

}
