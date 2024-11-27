package Ecommerce.src.java.model.entities;

public class Client extends Person{

    private Integer id;

    public Client() {
    }

    public Client(String name, String contact, String address, Integer id) {
        super(name, contact, address);
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
