package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 27518
 * @version 1.0
 * @description: TODO
 * @date 2023/6/29 16:05
 */
public class Home {
    private List<Animal> nodelist=new ArrayList<>();
    public void add(Animal animal){
        nodelist.add(animal);
    }
    public void action(Person person){
        for (Animal animal:nodelist){
            animal.accept(person);
        }
    }
}
