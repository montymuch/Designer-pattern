package Pojo.factory;

public abstract class Builder {
    protected  Bike b=new Bike();
    public  abstract void buildFrame();

    public  abstract void buildSeat();

    public abstract Bike createBike();
}
