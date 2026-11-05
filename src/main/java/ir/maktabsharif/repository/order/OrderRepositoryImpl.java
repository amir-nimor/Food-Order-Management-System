package ir.maktabsharif.repository.order;

import ir.maktabsharif.model.Food;
import ir.maktabsharif.model.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class OrderRepositoryImpl implements OrderRepository{

    private static final List<Order> orders = new ArrayList<>();


    @Override
    public void create(Order order) {
        if (order.getId()==null) {
            order.setId(orders.size()+1L);
        }
        orders.add(order);
    }

    @Override
    public List<Order> findAll() {
        return orders;
    }

    @Override
    public Order findById(Long id) {
        return orders.stream().filter(o -> o.getId().equals(id)).findFirst().orElse(null);
    }


}
