package Apapter;

public class TFCardImpl implements TFCard{


    @Override
    public String readTF() {
        String msg="read!。。";
        return msg;
    }

    @Override
    public void write(String msg) {
        System.out.println(msg);
    }
}
