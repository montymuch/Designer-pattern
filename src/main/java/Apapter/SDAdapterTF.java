package Apapter;

public class SDAdapterTF extends TFCardImpl implements SDCard{
    private TFCard tfCard;
    public SDAdapterTF(TFCard tfCard){
        this.tfCard=tfCard;
    }
    @Override
    public String read() {
        System.out.println("tf card");
        return readTF();}

    @Override
    public void write(String msg) {

    }
}
