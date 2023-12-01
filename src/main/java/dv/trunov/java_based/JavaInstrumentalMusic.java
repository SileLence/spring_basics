package dv.trunov.java_based;

import dv.trunov.Music;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class JavaInstrumentalMusic extends Music {

    private JavaInstrumentalMusic() {
    }

    private static JavaInstrumentalMusic getInstrumentalMusic() {
        JavaInstrumentalMusic instrumentalMusic = new JavaInstrumentalMusic();
        instrumentalMusic.songs = List.of("It's Never Too Late", "Song for George", "Windy and Warm");
        return instrumentalMusic;
    }

    @Override
    public String getSongName() {
        Random random = new Random();
        return songs.get(random.nextInt(0, 3));
    }
}
