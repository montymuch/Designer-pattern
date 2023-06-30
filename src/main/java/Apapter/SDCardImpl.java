package Apapter;

public class SDCardImpl implements SDCard{
    @Override
    public String read() {
        String msg="SDCcard read msg:hello world sd";
        return msg;
    }

    @Override
    public void write(String msg) {
        System.out.println("sdcard write+"+msg);
    }
}
