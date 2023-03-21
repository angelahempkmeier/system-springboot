package com.angie.system.config;

import com.angie.system.entities.Category;
import com.angie.system.entities.Order;
import com.angie.system.entities.Product;
import com.angie.system.entities.User;
import com.angie.system.entities.enums.OrderStatus;
import com.angie.system.repositories.CategoryRepository;
import com.angie.system.repositories.OrderRepository;
import com.angie.system.repositories.ProductRepository;
import com.angie.system.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "999999988", "123");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);

        Category c1 = new Category(null, "Eletronics");
        Category c2 = new Category(null, "Books");
        Category c3 = new Category(null, "Computers");

        Product p1 = new Product(null, "The Lord of the Rings", "Testeteste",90.5,"");
        Product p2 = new Product(null, "SmartTv", "Testeteste",2190.0,"");
        Product p3 = new Product(null, "Macbook Pro", "Testeteste",1250.0,"");
        Product p4 = new Product(null, "PC Gamer", "Testeteste",1200.0,"");
        Product p5 = new Product(null, "Rails for dumies", "Testeteste",109.99,"");

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
        categoryRepository.saveAll(Arrays.asList(c1, c2, c3));
        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
    }
}
