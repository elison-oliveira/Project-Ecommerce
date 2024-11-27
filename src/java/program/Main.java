package Ecommerce.src.java.program;

import Ecommerce.src.java.model.entities.Client;
import Ecommerce.src.java.model.entities.Order;
import Ecommerce.src.java.model.entities.OrderItem;
import Ecommerce.src.java.model.entities.Product;
import Ecommerce.model.product.entities.enums.Color;
import Ecommerce.src.java.repository.OrderRepository;
import Ecommerce.src.java.repository.ProductRepository;
import Ecommerce.src.java.service.DeliveryService;
import Ecommerce.src.java.service.PaymentService;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        ProductRepository productRepository = new ProductRepository();

        productRepository.add(new Product("bed", Color.WHITE, 450.00, 5, 1200536));
        productRepository.add(new Product("bed", Color.BLACK, 450.00, 10, 1200536));
        productRepository.add(new Product("chair", Color.WHITE, 20.00, 20, 1200536));

        Client client = new Client("Ana", "ana@gmail.com", "wall street nº 40", 123);

        System.out.println("welcome to the store, these are our products:");
        System.out.println(productRepository.showProducts());

//
        List<OrderItem> items = new ArrayList<>();

        OrderItem item1 = new OrderItem(productRepository.getProductRepository().get(1), 2);
        OrderItem item2 = new OrderItem(productRepository.getProductRepository().get(2), 4);

        items.add(item1);
        items.add(item2);

        OrderRepository orderRepository = new OrderRepository();

        orderRepository.add(new Order(client, items, new Date()));


        System.out.println(orderRepository.getOrderRepository().get(0));

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount to pay: ");

        double amount = sc.nextDouble();

        PaymentService paymentService = new PaymentService(orderRepository.getOrderRepository().get(0));

        paymentService.payment(amount);

        System.out.println(paymentService.transshipment(amount));

        System.out.println();


        sc.close();

        DeliveryService deliveryService = new DeliveryService(orderRepository.getOrderRepository().get(0));

        System.out.println(deliveryService.delivery());

    }
}
