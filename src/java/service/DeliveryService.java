package Ecommerce.src.java.service;

import Ecommerce.src.java.model.entities.Order;
import Ecommerce.src.java.model.entities.OrderItem;

public class DeliveryService {

    Order order;

    public DeliveryService(Order order) {
        this.order = order;
    }

    public String delivery(){
        StringBuilder sb = new StringBuilder();


        sb.append("Order - ").append(order.getDate());
        sb.append(" client: ").append(order.getClient());
        sb.append("\nitems:");
        for(OrderItem i : order.getItem()) {
            sb.append("\n").append(i.getProduct()).append("; quantity: ").append(i.getQuantity()).append("; sub total : $").append(String.format("%.2f", i.subTotal()));
        }
        sb.append("\n\ntotal value: $ ").append(String.format("%.2f", order.totalValue()));

        return sb.toString();
    }

}
