package se.air.airbean.airbean.entites;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class OrderLine {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private int quantity;

  @ManyToOne
  private Product product;



}
