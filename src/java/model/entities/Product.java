package Ecommerce.src.java.model.entities;

import Ecommerce.model.product.entities.enums.Color;

public class Product {

    private String product;
    private Double price;
    private Integer quantity;
    private Integer code;
    private Color color;

    public Product() {
    }

    public Product(String product, Color color, Double price, Integer quantity, Integer code) {
        this.product = product;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
        this.code = code;
    }



    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Double valueInStock(){
        return price * quantity;
    }

    public void removeItem(Integer quantity){
        this.quantity -= quantity;
    }

    public void addItem(Integer quantity){
        this.quantity += quantity;
    }

    @Override
    public String toString() {
        return  product + " " + color +  " - " + code + "\nprice: $" + String.format("%.2f", price) ;
    }
}
