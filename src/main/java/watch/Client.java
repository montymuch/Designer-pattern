package watch;

public class Client {
    public static void main(String[] args) {
        SubsriptionSubject subsriptionSubject=new SubsriptionSubject();

        subsriptionSubject.watch(new WeixiUser("孙悟空"));
        subsriptionSubject.watch(new WeixiUser("猪八戒"));
        subsriptionSubject.watch(new WeixiUser("沙悟净"));

        //公众号更新
        subsriptionSubject.notify("更新了");
    }
}
