package se.air.airbean.airbean.entites;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
public class OrderHistory {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String orderNumber;
  private int totalSum;
  private LocalDate date;

  public OrderHistory() {
    this.date = LocalDate.now();
  }
}
