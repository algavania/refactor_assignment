
import models.Order;
import repositories.order.OrderRepository;
import services.NotificationService;

public class OrderProcessor {
    private OrderRepository orderRepository; 
    private NotificationService notificationService; 

    public OrderProcessor(OrderRepository orderRepository, NotificationService notificationService) {
        this.orderRepository = orderRepository;
        this.notificationService = notificationService;
    }

    public void processOrder(Order order) {
        if (!validateOrder(order)) {
            throw new IllegalArgumentException("Pesanan tidak valid");
        }

        double finalPrice = calculateFinalPrice(order);
        orderRepository.saveOrder(order, finalPrice);
        notificationService.sendNotification(order.getCustomer().getPhone(), "Pesanan Anda telah diproses dengan total: " + finalPrice);
    }

    private boolean validateOrder(Order order) {
        return order.getOrderId() != null && 
               order.getCustomer() != null && 
               !order.getMenuItems().isEmpty() &&
               order.getTotalPrice() > 0;
    }

    private double calculateFinalPrice(Order order) {
        double discount = order.getDiscount() != null ? order.getDiscount().apply(order.getTotalPrice()) : 0;
        return order.getTotalPrice() + order.getTax() - discount;
    }
}
