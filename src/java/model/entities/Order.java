package Ecommerce.src.java.model.entities;

import Ecommerce.src.java.model.entities.Client;
import Ecommerce.src.java.model.entities.OrderItem;

import java.util.Date;
import java.util.List;

public class Order {

    private Client client;
    private List<OrderItem> item;
    private Date date;

    public Order() {
    }

    public Order(Client client, List<OrderItem> item, Date date) {
        this.client = client;
        this.date = date;
        this.item = item;

        for(OrderItem i : item){
            i.getProduct().removeItem(i.getQuantity());
        }
    }

    public Client getClient() {
        return client;
    }

    public Date getDate() {
        return date;
    }

    public List<OrderItem> getItem() {
        return item;
    }

    public void setItem(List<OrderItem> item) {
        this.item = item;
    }

    public Double totalValue(){
        double totalValue = 0;

        for(OrderItem i : item){
            totalValue += i.subTotal();
        }

        return totalValue;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("\nitems:");
        for(OrderItem i : item) {
                    sb.append("\n" + i.getProduct() + "; quantity: " + i.getQuantity() + "; sub total : $" + String.format("%.2f", i.subTotal()));
                }
        sb.append("\n\ntotal value: $ " + String.format("%.2f", totalValue()));

        return sb.toString();
    }

}
