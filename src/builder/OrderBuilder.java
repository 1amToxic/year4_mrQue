package builder;

public interface OrderBuilder {
    OrderBuilder orderBread(BreadType breadType);
    OrderBuilder orderType(OrderType orderType);
    Order build();
}
