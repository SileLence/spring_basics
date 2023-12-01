package dv.trunov.annotation_based;

import dv.trunov.MusicGenre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AnnotationComputer {

    @Value("${computer.id}")
    private int id;

    @Autowired
    private AnnotationMusicPlayer player;

    public AnnotationMusicPlayer getMusicPlayer() {
        return player;
    }

    public void runMusicPlayer(MusicGenre genre) {
        System.out.printf("AnnotationComputer -> Playing: %s\n", player.playMusic(genre));
    }
}
