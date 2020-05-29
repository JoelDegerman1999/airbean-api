package se.air.airbean.airbean.entites;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String email;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<OrderHistory> orderHistory;

}
