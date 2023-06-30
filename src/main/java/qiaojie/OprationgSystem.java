package qiaojie;

public abstract class  OprationgSystem {
    protected VideoFile videoFile;

    public OprationgSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
