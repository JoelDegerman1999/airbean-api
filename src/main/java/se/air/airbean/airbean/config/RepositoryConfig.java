package se.air.airbean.airbean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import se.air.airbean.airbean.entites.OrderLine;
import se.air.airbean.airbean.entites.Product;
import se.air.airbean.airbean.entites.RealOrder;
import se.air.airbean.airbean.entites.User;

@Configuration
public class RepositoryConfig {

    @Bean
    public RepositoryRestConfigurer repositoryRestConfigurer() {
        return RepositoryRestConfigurer.withConfig(config -> {
            config.exposeIdsFor(Product.class);
            config.exposeIdsFor(OrderLine.class);
            config.exposeIdsFor(RealOrder.class);
            config.exposeIdsFor(User.class);
        });
    }
}
