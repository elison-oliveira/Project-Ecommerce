package Ecommerce.src.java.service;

import Ecommerce.src.java.model.entities.Order;

public class PaymentService {

    Order order;

    public PaymentService(Order order) {
        this.order = order;
    }

    public String transshipment(double amount){

        return "your transshipment is U$ " + (amount - order.totalValue());

    }

    public void payment(double amount){
        if(amount >= order.totalValue()){
            transshipment(amount);
        }
        else{
            System.out.println("amount insufficient");
        }

    }

}
