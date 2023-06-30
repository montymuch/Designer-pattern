package Pojo.factory;

public class Direct {
    private Builder mBuilder;

    public Direct(MobileBuilder mobileBuilder) {

    }

    public void Director(Builder builder) {
        mBuilder = builder;
    }
    public Bike construct() {
        mBuilder.buildFrame();
        mBuilder.buildSeat();
        return mBuilder.createBike();
    }

}
