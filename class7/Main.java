public class Main {

    public static void main(String[] args) {

        System.out.println("\n FOOD ORDERS");

        OrderRepository<Integer, Double> FoodR = new OrderRepository<>();

        FoodR.addOrder(new Order<>(1, "Japanese Beef",      950.99));
        FoodR.addOrder(new Order<>(2, "Korean BBQ",     820.50));
        FoodR.addOrder(new Order<>(3, "Chinese Duck Feast",    760.00));
        FoodR.addOrder(new Order<>(4, "Thai Seafood",  890.75));
        FoodR.addOrder(new Order<>(5, "Indian Mughlai Thali",   680.00));

        FoodR.displayAll();

        System.out.println("  TOTAL FOOD BILL     : $" + FoodR.calculateTotal());
        System.out.println("  MOST EXPENSIVE FOOD : " +
                FoodR.findMostExpensive().getItemName() +
                " -> $" + FoodR.findMostExpensive().getPrice());

    
        System.out.println("\n ELECTRONICS ORDERS");

        OrderRepository<String, Integer> electronicsR = new OrderRepository<>();

        electronicsR.addOrder(new Order<>("EL-01", "Sony PlayStation 5 Pro",       1200));
        electronicsR.addOrder(new Order<>("EL-02", "Samsung Galaxy S25 Ultra",     1500));
        electronicsR.addOrder(new Order<>("EL-03", "DJI Mavic 4 Pro Drone",        2800));
        electronicsR.addOrder(new Order<>("EL-04", "Asus ROG Gaming Laptop",       3500));
        electronicsR.addOrder(new Order<>("EL-05", "Apple MacBook Pro M4",         4200));

        electronicsR.displayAll();

        System.out.println("  TOTAL ELECTRONICS BILL     : $" + electronicsR.calculateTotal());
        System.out.println("  MOST EXPENSIVE ELECTRONICS : " +
                electronicsR.findMostExpensive().getItemName() +
                " -> $" + electronicsR.findMostExpensive().getPrice());

     
        System.out.println("\n SERVICE ORDERS");

        OrderRepository<String, Double> serviceRepo = new OrderRepository<>();

        serviceRepo.addOrder(new Order<>("SV-01", "Tokyo Luxury Spa Package",        1500.00));
        serviceRepo.addOrder(new Order<>("SV-02", "Bali Private Villa Service",      2200.50));
        serviceRepo.addOrder(new Order<>("SV-03", "Seoul Premium Skincare Session",   980.00));
        serviceRepo.addOrder(new Order<>("SV-04", "Shanghai VIP Concierge Service",  3100.75));

        serviceRepo.displayAll();

        System.out.println("  TOTAL SERVICE BILL     : $" + serviceRepo.calculateTotal());
        System.out.println("  MOST EXPENSIVE SERVICE : " +
                serviceRepo.findMostExpensive().getItemName() +
                " -> $" + serviceRepo.findMostExpensive().getPrice());

       
        
        System.out.println("GRAND SUMMARY");
        System.out.println("  Total Food Bill        : $" + FoodR.calculateTotal());
        System.out.println("  Total Electronics Bill : $" + electronicsR.calculateTotal());
        System.out.println("  Total Service Bill     : $" + serviceRepo.calculateTotal());
        double grandTotal = FoodR.calculateTotal() +
                            electronicsR.calculateTotal() +
                            serviceRepo.calculateTotal();
        System.out.println("  -------------------------");
        System.out.println("  GRAND TOTAL            : $" + grandTotal);
        System.out.println("\n  Thank you for the order!");
    }
}