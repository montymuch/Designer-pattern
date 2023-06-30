package structure.AOP;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory implements MethodInterceptor {
    public Station station=new Station();

    public Station getProxyObject(){
     /* SellTickets sellTickets=(SellTickets) Proxy.newProxyInstance(
              station.getClass().getClassLoader(),
              station.getClass().getInterfaces(),
              new InvocationHandler() {
                  @Override
                  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                      System.out.println("代理方法执行！");
                      System.out.println(method);
                      Object invoke = method.invoke(station, args);
                      System.out.println("收取服务费");
                      return invoke;
                  }
              }
      );*/

        Enhancer enhancer =new Enhancer();
        enhancer.setSuperclass(Station.class);
        enhancer.setCallback(this);
        Station proxy = (Station) enhancer.create();
        return proxy;

    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("执行了");
        method.invoke(station,methodProxy);
        return null;
    }
}
