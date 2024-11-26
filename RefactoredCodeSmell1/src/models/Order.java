package models;
import java.util.List;

public class Order {
    private String orderId;
    private Customer customer;
    private List<String> menuItems;
    private double totalPrice;
    private double tax;
    private Discount discount;
    private String paymentMethod;

    public Order(String orderId, Customer customer, List<String> menuItems, double totalPrice, double tax, Discount discount, String paymentMethod) {
        this.orderId = orderId;
        this.customer = customer;
        this.menuItems = menuItems;
        this.totalPrice = totalPrice;
        this.tax = tax;
        this.discount = discount;
        this.paymentMethod = paymentMethod;
    }

    public String getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<String> getMenuItems() {
        return menuItems;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getTax() {
        return tax;
    }

    public Discount getDiscount() {
        return discount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setMenuItems(List<String> menuItems) {
        this.menuItems = menuItems;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
