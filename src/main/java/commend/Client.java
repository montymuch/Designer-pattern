package commend;

public class Client {
    public static void main(String[] args) {
        Order order1=new Order();
        order1.setDiningTable(1);
        order1.setFood("西红柿炒鸡蛋",2);
        order1.setFood("糖醋里脊",4);
        Order order2=new Order();
        order2.setDiningTable(2);
        order2.setFood("西红柿炒鸡蛋",2);
        order2.setFood("糖醋里脊",4);

        //创建厨师对象
        SeniorChef seniorChef=new SeniorChef();
        OrderCommand cmd1 = new OrderCommand(seniorChef,order1);
        OrderCommand cmd2 = new OrderCommand(seniorChef,order2);

        //创建调用者
        Watior watior=new Watior();
        watior.setCommands(cmd1);
        watior.setCommands(cmd2);
        watior.say();
    }
}
