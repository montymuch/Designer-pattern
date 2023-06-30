package commend;

import java.util.Map;
import java.util.Set;

public class OrderCommand implements Command{
    private SeniorChef seniorChef;
    private Order order;
    @Override
    public void execute() {
        System.out.println(order.getDiningTable()+"桌的订单");
        Map<String, Integer> foodDir = order.getFoodDir();
        Set<String> strings = foodDir.keySet();
        for(String foodName:strings){
            seniorChef.makeFood(foodName,foodDir.get(foodName));
        }
        System.out.println(order.getDiningTable()+"桌准备好了");
    }

    public OrderCommand(SeniorChef seniorChef, Order order) {
        this.seniorChef = seniorChef;
        this.order = order;
    }
}
