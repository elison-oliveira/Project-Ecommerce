package Ecommerce.src.java.model.entities;

import Ecommerce.src.java.model.entities.Product;

public class OrderItem {

    private Product product;
    private Integer quantity;

    public OrderItem() {
    }

    public OrderItem(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double subTotal(){
        return quantity * product.getPrice();
    }
}
