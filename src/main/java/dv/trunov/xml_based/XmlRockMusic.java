package dv.trunov.xml_based;

import dv.trunov.Music;

import java.util.List;
import java.util.Random;

public class XmlRockMusic extends Music {

    public XmlRockMusic() {
        this.songs = List.of("Du Hast", "Moth into Flame", "Hit the Floor");
    }
    @Override
    public String getSongName() {
        Random random = new Random();
        return songs.get(random.nextInt(0, 3));
    }
}
