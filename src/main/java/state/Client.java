package state;

public class Client {
    public static void main(String[] args) {
        Lift lift=new Lift();
        lift.setState(2);
        lift.open();
    }
}
