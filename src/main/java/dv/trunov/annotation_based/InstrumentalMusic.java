package dv.trunov.annotation_based;

import dv.trunov.Music;

import java.util.List;
import java.util.Random;

public class InstrumentalMusic extends Music {

    private InstrumentalMusic() {
    }

    private static InstrumentalMusic getInstrumentalMusic() {
        InstrumentalMusic instrumentalMusic = new InstrumentalMusic();
        instrumentalMusic.songs = List.of("It's Never Too Late", "Song for George", "Windy and Warm");
        return instrumentalMusic;
    }

    @Override
    public String getSongName() {
        Random random = new Random();
        return songs.get(random.nextInt(0, 3));
    }
}
