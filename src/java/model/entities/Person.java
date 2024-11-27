package Ecommerce.src.java.model.entities;

public abstract class Person {

    private String name;
    private String contact;
    private String address;

    public Person() {
    }

    public Person(String name, String contact, String address) {
        this.name = name;
        this.contact = contact;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString(){
        return name + " - " + contact + " - " + address;
    }
}
