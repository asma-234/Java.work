import java.util.*;

class Order<I, P extends Number> {

    private I id;
    private String itemName;
    private P price;

    public Order(I id, String itemName, P price) {
        this.id = id;
        this.itemName = itemName;
        this.price = price;
    }

    public I getId() { return id; }
    public String getItemName() { return itemName; }
    public P getPrice() { return price; }

    public void display() {
        System.out.println("  ID    : " + id);
        System.out.println("  Item  : " + itemName);
        System.out.println("  Price : $" + price);
        System.out.println("  -------------------------");
    }
}

class OrderRepository<I, P extends Number> {

    private List<Order<I, P>> orders = new ArrayList<>();

    public void addOrder(Order<I, P> order) {
        orders.add(order);
    }

    public void displayAll() {
        for (Order<I, P> order : orders) {
            order.display();
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Order<I, P> order : orders) {
            total += order.getPrice().doubleValue();
        }
        return total;
    }

    public Order<I, P> findMostExpensive() {
        Order<I, P> mostExpensive = orders.get(0);
        for (Order<I, P> order : orders) {
            if (order.getPrice().doubleValue() > mostExpensive.getPrice().doubleValue()) {
                mostExpensive = order;
            }
        }
        return mostExpensive;
    }
}
