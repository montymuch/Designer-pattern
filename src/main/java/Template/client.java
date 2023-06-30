package Template;

public class client {
    public static void main(String[] args) {
       AbstractTemplate bc=new ConcreteClass_Baocai();
        bc.cookProcess();
        System.out.println("----------------------------------------");
        AbstractTemplate cx=new Caixin();
        cx.cookProcess();
    }
}
