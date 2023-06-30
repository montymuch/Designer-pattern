package Template;

public abstract class AbstractTemplate {

    public final void cookProcess(){
        //按顺序执行 算法框架 抽象框架
        pouroil();
        heatOil();
        pourVegetable();
        pourSauce();
        fry();
    }


    public void pouroil(){
        System.out.println("倒油");
    }
    public  void heatOil(){
        System.out.println("热油");
    }
    public abstract void pourVegetable();

    public abstract void pourSauce();

    public void fry(){
        System.out.println("炒啊炒");
    }

}
