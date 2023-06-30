package Pojo.factory;

public class BcoffeeFactory implements AbstractFactory{
    @Override
    public String createCoffee() {
        return new String("bcoffee");
    }
}
