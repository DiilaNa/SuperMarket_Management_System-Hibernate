package lk.ijse.gdse.supermarket.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "item" )
public class Item implements SuperEntity{
    @Id
    @Column(name = "customer_id")
    private String itemId;
    @Column(length = 100)
    private String itemName;
    private int quantity;
    private double price;

    @OneToMany(mappedBy = "item")
    private List<OrderDetails> orderDetails;
}

