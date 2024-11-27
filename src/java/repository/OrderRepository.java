package Ecommerce.src.java.repository;

import Ecommerce.src.java.model.entities.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository {

    public List<Order> orderRepository;

    public OrderRepository(){
        this.orderRepository = new ArrayList<>();
    }

    public List<Order> getOrderRepository() {
        return orderRepository;
    }

    public void setOrderRepository(List<Order> orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void add(Order order){
        orderRepository.add(order);
    }

    public void remove(Order order){
        orderRepository.remove(order);
    }

    public String showOrders(){

        StringBuilder sb = new StringBuilder();

        for(Order o : orderRepository){
            sb.append("\n").append(o.toString()).append("\n");
        }

        return sb.toString();
    }
}
