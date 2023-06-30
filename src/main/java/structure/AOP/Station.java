package structure.AOP;

public class Station implements SellTickets{
    @Override
    public String sell() {
        System.out.println("火车站卖票");
        return "买票成功";
    }
}
