package strategy;

public class client {
    public static void main(String[] args) {
       new SalesMan(new Astrategy()).show();
        new SalesMan(new Cstrategy()).show();
        new SalesMan(new Bstrategy()).show();
    }
}
