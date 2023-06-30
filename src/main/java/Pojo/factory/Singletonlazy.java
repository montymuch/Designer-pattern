package Pojo.factory;

public class Singletonlazy {
    private static Singletonlazy instance=new Singletonlazy();

    public Singletonlazy() {
    }
    public boolean process(){

        System.out.println("实例化方法执行成功~");
        return false;
    }
//    public static Singletonlazy getInstacce(){
//        if(instance==null){
//            instance =new Singletonlazy();
//
//        }
//        return instance;
//    }
//
//    public static synchronized Singletonlazy getInstacce2(){
//        if(instance==null){
//            instance =new Singletonlazy();
//
//        }
//        return instance;
//    }
//    public static  Singletonlazy getInstacce3(){
//
//        if(instance==null){
//          synchronized (Singletonlazy.class){
//              if(instance==null){
//              instance =new Singletonlazy();}}
//
//        }
//        return instance;
//    }
//
//    public static Singletonlazy getInstance() {
//        return instance;
//    }
//
//    public static void setInstance(Singletonlazy instance) {
//        Singletonlazy.instance = instance;
//    }


}
