package dv.trunov.annotation_based;

import dv.trunov.Music;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class AnnotationInstrumentalMusic extends Music {

    private AnnotationInstrumentalMusic() {
    }

    private static AnnotationInstrumentalMusic getInstrumentalMusic() {
        AnnotationInstrumentalMusic instrumentalMusic = new AnnotationInstrumentalMusic();
        instrumentalMusic.songs = List.of("It's Never Too Late", "Song for George", "Windy and Warm");
        return instrumentalMusic;
    }

    @Override
    public String getSongName() {
        Random random = new Random();
        return songs.get(random.nextInt(0, 3));
    }
}
