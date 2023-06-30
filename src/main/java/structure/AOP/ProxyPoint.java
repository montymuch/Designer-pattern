package structure.AOP;

public class ProxyPoint implements SellTickets{
    private  Station station=new Station();
    @Override
    public String sell() {
        System.out.println("收取代理费");
         station.sell();
        return "123";
    }
}
