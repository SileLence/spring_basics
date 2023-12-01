package dv.trunov.java_based;

import dv.trunov.MusicGenre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class JavaComputer {

    @Value("${computer.id}")
    private int id;

    @Autowired
    private JavaMusicPlayer player;

    public JavaMusicPlayer getMusicPlayer() {
        return player;
    }

    public void runMusicPlayer(MusicGenre genre) {
        System.out.printf("Computer -> Playing: %s\n", player.playMusic(genre));
    }
}
