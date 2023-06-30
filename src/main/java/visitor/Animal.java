package visitor;

/**
 * @author 27518
 * @version 1.0memento
 * @description: 抽象被访问者
 * @date 2023/6/29 16:01
 */
public interface Animal {
    void accept(Person person);
}
