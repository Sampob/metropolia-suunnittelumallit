package Adapter;

public class MP4Player implements AdvancedMediaPlayer {

    @Override
    public void playFile(String file) {
        System.out.println("Playing mp4 file " + file);
    }

}
