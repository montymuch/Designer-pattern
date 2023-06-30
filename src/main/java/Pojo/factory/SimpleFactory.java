package Pojo.factory;

public class SimpleFactory {
    //如果希望获取一个对象通过传递参数（类型信息）来获取对象
    public String create(String type){
        return new String(type);
    }
}
