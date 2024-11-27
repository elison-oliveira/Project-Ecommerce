package Ecommerce.src.java.repository;

import Ecommerce.src.java.model.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    public List<Product> productRepository;

    public ProductRepository(){
       this.productRepository = new ArrayList<>();
    }

    public List<Product> getProductRepository() {
        return productRepository;
    }

    public void setProductRepository(List<Product> productRepository) {
        this.productRepository = productRepository;
    }

    public void add(Product product){
        productRepository.add(product);
    }

    public void remove(Product product){
        productRepository.remove(product);
    }

    public String showProducts(){

        StringBuilder sb = new StringBuilder();

        for(Product p : productRepository){
            sb.append("\n").append(p.toString()).append("\n");
        }

        return sb.toString();
    }
}
