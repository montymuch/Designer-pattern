package state;

public class Lift implements Ilift{
    private int state;
    //声明一个记录电梯状态的变量
    @Override
    public void setState(int state) {
        this.state=state;
    }

    @Override
    public void open() {
          switch (state){
              case OPENING_STATE -> { break;
               }
              case CLOSING_STATE -> {System.out.println("电梯打开了");setState(OPENING_STATE);break;}
              case RUNNING_STATE -> {break;}
              case STOPPING_STATE -> {System.out.println("电梯打开了");setState(OPENING_STATE);break;}
          }
    }

    @Override
    public void close() {

    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
