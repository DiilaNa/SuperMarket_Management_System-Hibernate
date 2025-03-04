package lk.ijse.gdse.supermarket.entity;


import jakarta.persistence.*;
import lombok.*;


import java.sql.Date;
import java.util.List;


// Lombok annotations to generate methods automatically and reduce boilerplate code
@AllArgsConstructor     // @AllArgsConstructor: Generates a constructor with all fields as parameters
@NoArgsConstructor      // @NoArgsConstructor: Generates a no-argument constructor
@Data
@Entity
@Table(name = "orders")
public class Order implements SuperEntity {
    @Id
    @Column(name = "order_id")
    private String orderId;
    private String customerId;
    private Date orderDate;

    @ManyToOne
    @JoinColumn(name = "cust_id")
    private Customer customer;

    @OneToMany(mappedBy = "orders")
    private List<OrderDetails> orderDetails;

}
