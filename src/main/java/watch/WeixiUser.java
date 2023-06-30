package watch;

public class WeixiUser implements Observer {
    private  String name;

    public WeixiUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println(name+"接受到了消息："+msg);
    }
}
