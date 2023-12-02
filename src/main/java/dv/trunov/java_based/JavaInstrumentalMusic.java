package dv.trunov.java_based;

import dv.trunov.Music;

import java.util.List;
import java.util.Random;

public class JavaInstrumentalMusic extends Music {

    private JavaInstrumentalMusic() {
    }

    public static JavaInstrumentalMusic getInstrumentalMusic() {
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
