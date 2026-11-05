package ir.maktabsharif.service.order;

import ir.maktabsharif.model.Order;
import ir.maktabsharif.repository.order.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements  OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void create(Order order) {
        orderRepository.create(order);
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order findById(Long id) {
        return orderRepository.findById(id);
    }
}
