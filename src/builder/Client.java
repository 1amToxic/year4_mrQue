package builder;

public class Client {
    public static void main(String[] args) {
        Order order = new FastFoodOrderBuilder().orderBread(BreadType.BEEF).orderType(OrderType.TAKE_AWAY).build();
        System.out.println(order);
    }
}
