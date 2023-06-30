package mediator;

public class HouserOwner extends Person{
    public HouserOwner(String name, Mediator mediator) {
        super(name, mediator);
    }
    public void constract(String msg){
        mediator.constact(msg,this);
    }
    public void getMessage(String msg){
        System.out.println("房主获取到的信息是："+msg);
    }
}
