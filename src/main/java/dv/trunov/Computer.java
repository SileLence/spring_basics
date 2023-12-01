package dv.trunov;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Computer {

    @Value("${computer.id}")
    private int id;

    @Autowired
    private MusicPlayer player;

    public MusicPlayer getMusicPlayer() {
        return player;
    }

    public void runMusicPlayer(MusicGenre genre) {
        System.out.printf("Computer -> Playing: %s\n", player.playMusic(genre));
    }
}
