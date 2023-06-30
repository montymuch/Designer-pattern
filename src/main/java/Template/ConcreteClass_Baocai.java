package Template;

public class ConcreteClass_Baocai extends AbstractTemplate{
    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("酱料是辣椒");
    }
}
