package lk.ijse.gdse.supermarket.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="customer")

public class Customer implements SuperEntity {
    @Id
    @Column(name = "customer_id")
    private String id;
    private String name;
    private String nic;
    private String email;
    private String phone;

    @OneToMany(mappedBy = "customer" , cascade = CascadeType.ALL)
    private List<Order> orders;
}
