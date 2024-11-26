package repositories.order;

import models.Order;

public interface OrderRepository {
    void saveOrder(Order order, double finalPrice);
}
