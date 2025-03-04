package lk.ijse.gdse.supermarket.entity;


import jakarta.persistence.*;
import lombok.*;


import java.sql.Date;


// Lombok annotations to generate methods automatically and reduce boilerplate code
@AllArgsConstructor     // @AllArgsConstructor: Generates a constructor with all fields as parameters
@NoArgsConstructor      // @NoArgsConstructor: Generates a no-argument constructor
@Data
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @Column(name = "order_id")
    private String orderId;
    private String customerId;
    private Date orderDate;
    @ManyToOne
    @JoinColumn(name = "cust_id")
    private Customer customer;



    // @orderDetailsDTOS: A list of OrderDetailsDTO objects, each representing an item in the order
}
