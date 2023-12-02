package dv.trunov.java_based;

import dv.trunov.Music;

import java.util.List;
import java.util.Random;

public class JavaRockMusic extends Music {

    public JavaRockMusic() {
        this.songs = List.of("Du Hast", "Moth into Flame", "Hit the Floor");
    }
    @Override
    public String getSongName() {
        Random random = new Random();
        return songs.get(random.nextInt(0, 3));
    }
}
