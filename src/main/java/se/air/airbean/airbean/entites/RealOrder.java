package se.air.airbean.airbean.entites;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

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
  private int eta;

  public RealOrder() {
    orderLines = new HashSet<>();
    orderNumber = generateRandomOrderNumber();
    eta = generateRandomEta();
  }

  public String generateRandomOrderNumber() {

    String randomNumber = UUID.randomUUID().toString();
    randomNumber = randomNumber.substring(0, 15);
    randomNumber = randomNumber.toUpperCase();
    randomNumber = "#" + randomNumber;
    return  randomNumber;

  }
  public int generateRandomEta() {
    Random r = new Random();
    int low = 10;
    int high = 35;
    return r.nextInt(high-low)+ low;
  }
}
