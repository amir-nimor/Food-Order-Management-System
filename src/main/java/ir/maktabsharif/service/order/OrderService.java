package ir.maktabsharif.service.order;

import ir.maktabsharif.model.Order;

import java.util.List;

public interface OrderService {

    void create(Order order);

    List<Order> findAll();

    Order findById(Long id);
}
