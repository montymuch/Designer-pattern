package Pojo.factory;

public class test {
    public static void main(String[] args) throws CloneNotSupportedException {

       Direct direct=new Direct(new MobileBuilder());
        Bike bike = direct.construct();
        System.out.println(bike);
    }
}
