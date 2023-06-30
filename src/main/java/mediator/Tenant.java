package mediator;

public class Tenant extends Person{
    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }
    //和中介联系和沟通
    public void constract(String msg){
        mediator.constact(msg,this);
    }
    public void getMessage(String msg){
        System.out.println("租房者获取到的信息是："+msg);
    }
}
