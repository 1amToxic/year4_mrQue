package builder;

public class Order {
    private BreadType breadType;
    private OrderType orderType;

    public Order(BreadType breadType, OrderType orderType) {
        this.breadType = breadType;
        this.orderType = orderType;
    }

    public BreadType getBreadType() {
        return breadType;
    }

    public OrderType getOrderType() {
        return orderType;
    }
}
enum BreadType {
    SIMPLE, OMELETTE, FRIED_EGG, GRILLED_FISH, PORK, BEEF,
}

enum OrderType {
    ON_SITE, TAKE_AWAY;
}
