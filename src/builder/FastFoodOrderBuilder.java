package builder;

public class FastFoodOrderBuilder implements OrderBuilder{
    private OrderType orderType;
    private BreadType breadType;
    @Override
    public OrderBuilder orderBread(BreadType breadType) {
        this.breadType = breadType;
        return this;
    }

    @Override
    public OrderBuilder orderType(OrderType orderType) {
        this.orderType = orderType;
        return this;
    }

    @Override
    public Order build() {
        return new Order(breadType,orderType);
    }
}
