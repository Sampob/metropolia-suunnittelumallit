package Adapter;

public class MP3Player implements MediaPlayer {

    @Override
    public void play(String file) {
        System.out.println("Playing mp3 file " + file);
    }

}
