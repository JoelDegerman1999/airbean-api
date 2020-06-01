package se.air.airbean.airbean.projections;

import org.hibernate.criterion.Order;
import org.springframework.data.rest.core.config.Projection;
import se.air.airbean.airbean.entites.OrderHistory;
import se.air.airbean.airbean.entites.User;

import java.util.Set;

@Projection(
        name = "customUser",
        types = {User.class}
)
public interface CustomUser {
    Long getId();
    Set<OrderHistory> getOrderHistory();
    String getName();
    String getEmail();

}
