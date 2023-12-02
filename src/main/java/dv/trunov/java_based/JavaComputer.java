package dv.trunov.java_based;

import dv.trunov.MusicGenre;
import org.springframework.beans.factory.annotation.Value;

public class JavaComputer {

    @Value("${computer.id}")
    private int id;

    private final JavaMusicPlayer musicPlayer;

    public JavaComputer(JavaMusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public JavaMusicPlayer getMusicPlayer() {
        return musicPlayer;
    }

    public void runMusicPlayer(MusicGenre genre) {
        System.out.printf("JavaComputer %d -> Playing: %s\n", id, musicPlayer.playMusic(genre));
    }
}
