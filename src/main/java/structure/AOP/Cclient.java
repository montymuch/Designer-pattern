package structure.AOP;

import java.lang.reflect.Proxy;

public class Cclient {
    //创建工厂
    public static void main(String[] args) {
   /*     ProxyFactory proxyFactory=new ProxyFactory();
        SellTickets proxyObject = proxyFactory.getProxyObject();
        //返回代理类 代理类自动实现代理接口
        String sell = proxyObject.sell();
        System.out.println(sell);*/
       ProxyFactory fc=new ProxyFactory();
        Station proxyObject = fc.getProxyObject();
        proxyObject.sell();


    }


}
