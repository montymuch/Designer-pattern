package watch;

import java.util.ArrayList;
import java.util.List;

public class SubsriptionSubject implements Subject{
    //定义一个集合用来处理观察者对象
    private List<Observer> wxl=new ArrayList<>();

    @Override
    public void watch(Observer obs) {
        wxl.add(obs);
    }

    @Override
    public void detach(Observer obs) {
          wxl.remove(obs);
    }

    @Override
    public void notify(String message) {
        for (Observer observer:wxl){
            observer.update(message);
        }
    }
}
