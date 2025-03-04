package lk.ijse.gdse.supermarket.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "order_details")

public class OrderDetails implements  SuperEntity {
    private String orderId;
    private String itemId;
    private int quantity;
    private double price;
}