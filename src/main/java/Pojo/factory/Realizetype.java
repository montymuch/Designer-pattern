package Pojo.factory;

public class Realizetype implements Cloneable{


    public Realizetype clone() throws CloneNotSupportedException {
        System.out.println("克隆完成");
        return (Realizetype) super.clone();

    }
}
