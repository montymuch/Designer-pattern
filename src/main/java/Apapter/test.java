package Apapter;

public class test {
    public static void main(String[] args) {
        Computer computer=new Computer();
        String s = computer.readSD(new SDCardImpl());
        System.out.println(s);

        //定义适配器类
        String readSD = computer.readSD(new SDAdapterTF(new TFCardImpl()));
        System.out.println(readSD);

    }
}
