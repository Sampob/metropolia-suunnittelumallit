package Adapter;

public class MediaPlayerAdapter implements MediaPlayer {

    private AdvancedMediaPlayer amp;

    public MediaPlayerAdapter(AdvancedMediaPlayer amp) {
        this.amp = amp;
    }

    @Override
    public void play(String file) {
        System.out.print("Using Adapter - ");
        amp.playFile(file);
    }

}
