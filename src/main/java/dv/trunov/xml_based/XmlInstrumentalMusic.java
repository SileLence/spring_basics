package dv.trunov.xml_based;

import dv.trunov.Music;

import java.util.List;
import java.util.Random;

public class XmlInstrumentalMusic extends Music {

    private XmlInstrumentalMusic() {
    }

    private static XmlInstrumentalMusic getInstrumentalMusic() {
        XmlInstrumentalMusic instrumentalMusic = new XmlInstrumentalMusic();
        instrumentalMusic.songs = List.of("It's Never Too Late", "Song for George", "Windy and Warm");
        return instrumentalMusic;
    }

    @Override
    public String getSongName() {
        Random random = new Random();
        return songs.get(random.nextInt(0, 3));
    }
}
