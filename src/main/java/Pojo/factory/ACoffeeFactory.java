package Pojo.factory;

public class ACoffeeFactory implements AbstractFactory{
    @Override
    public String createCoffee() {
        return new String("Acoffee");
    }
}
