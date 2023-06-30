package visitor;

/**
 * @author 27518
 * @version 1.0
 * @description: TODO
 * @date 2023/6/29 16:03
 */
public class Owner implements Person {
    @Override
    public void feed(Cat cat) {
        System.out.println("主人喂食猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("主人喂食狗");
    }
}
