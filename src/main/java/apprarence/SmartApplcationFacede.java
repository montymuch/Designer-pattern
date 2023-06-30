package apprarence;

public class SmartApplcationFacede {
    //聚合电视，电灯，空调
    private Light light;
    private TV tv;
    private AirCondition airCondition;

    public SmartApplcationFacede(){
        light=new Light();
        tv=new TV();
        airCondition=new AirCondition();

    }
    public void say(String msg){
        if(msg.contains("打开")){
            on();
        }else if(msg.contains("关闭")){
            off();
        }else {
            System.out.println("听不懂你说的！");
        }
    }
    private  void on(){
       light.on();
       tv.on();
       airCondition.on();
    }
    private  void off(){
        light.off();
        tv.off();
        airCondition.off();

    }
}
