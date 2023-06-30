package qiaojie;

public class Mac extends OprationgSystem{

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
         videoFile.decode("Mac:"+fileName);
    }
}
