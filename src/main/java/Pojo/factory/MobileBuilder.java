package Pojo.factory;

public class MobileBuilder extends Builder{
    @Override
    public void buildFrame() {
        b.setFrame("frame");
    }

    @Override
    public void buildSeat() {
       b.setSeat("set");
    }

    @Override
    public Bike createBike() {
        System.out.println(b.getFrame()+b.getSeat());
        return null;
    }
}
