package se.air.airbean.airbean;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import se.air.airbean.airbean.entites.Product;
import se.air.airbean.airbean.repositories.ProductRepository;
import se.air.airbean.airbean.repositories.RealOrderRepository;

@SpringBootApplication
public class AirbeanApplication {

  public static void main(String[] args) {
    SpringApplication.run(AirbeanApplication.class, args);
  }

  @Bean
  public CommandLineRunner runner(ProductRepository pRepo, RealOrderRepository orderRepository) {
    return (args -> {




      Product p1 = new Product();
      p1.setTitle("Bryggkaffe");
      p1.setDesc("Bryggd på månadens bönor.");
      p1.setPrice(39);

      Product p2 = new Product();
      p2.setDesc("Bryggd på månadens bönor.");
      p2.setPrice(49);
      p2.setTitle("Caffè Doppio");

      Product p3 = new Product();
      p3.setDesc("Bryggd på månadens bönor.");
      p3.setPrice(49);
      p3.setTitle("Cappuccino");

      Product p4 = new Product();
      p4.setDesc("Bryggd på månadens bönor.");
      p4.setPrice(54);
      p4.setTitle("Kaffe Latte");

      Product p5 = new Product();
      p5.setDesc("Bryggd på månadens bönor.");
      p5.setPrice(49);
      p5.setTitle("Latte Macchiato");



      pRepo.save(p1);
      pRepo.save(p2);
      pRepo.save(p3);
      pRepo.save(p4);
      pRepo.save(p5);
    });
  }
}
