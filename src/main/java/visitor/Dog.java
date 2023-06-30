package visitor;

/**
 * @author 27518
 * @version 1.0
 * @description: TODO
 * @date 2023/6/29 16:01
 */
public class  Dog implements Animal{
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("好好吃汪汪汪");
    }
}
