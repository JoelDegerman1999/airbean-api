package se.air.airbean.airbean.entites;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class RealOrder {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @ManyToMany(cascade = CascadeType.ALL)
  private Set<OrderLine> orderLines;

  private String orderNumber;
  private int totalPrice;

    public RealOrder() {
        orderLines = new HashSet<>();
        orderNumber = generateRandomOrderNumber();
    }

    public String generateRandomOrderNumber() {
    return "#123H123D123G";
  }
}
