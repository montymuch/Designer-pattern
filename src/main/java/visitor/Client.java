package visitor;

/**
 * @author 27518
 * @version 1.0
 * @description: TODO
 * @date 2023/6/29 16:04
 */
public class Client {
    public static void main(String[] args) {
        Owner owner=new Owner();
         Home home =new Home();
         home.add(new Cat());
         home.add(new Dog());
         home.action(owner);
    }
}
