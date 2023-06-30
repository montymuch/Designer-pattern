package apprarence;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        SmartApplcationFacede smartApplcationFacede=new SmartApplcationFacede();
        smartApplcationFacede.say("打开");
        Thread.sleep(1000);
        System.out.println("--------------------------------");
        smartApplcationFacede.say("关闭");
    }
}
