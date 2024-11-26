package repositories.order;

import models.Order;

public class OrderRepositoryImpl implements OrderRepository {
    @Override
    public void saveOrder(Order order, double finalPrice) {
        System.out.println("Pesanan disimpan ke database: " + order.getOrderId() + " dengan total harga: " + finalPrice);
    }
}
