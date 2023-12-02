package dv.trunov.java_based;

import dv.trunov.Music;
import dv.trunov.MusicGenre;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public class JavaMusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;
    private final Music rockMusic;
    private final Music instrumentalMusic;
    private Music ambientMusic;
    private List<Music> musicList;


    public JavaMusicPlayer(Music rockMusic, Music instrumentalMusic) {
        this.rockMusic = rockMusic;
        this.instrumentalMusic = instrumentalMusic;
    }

    public void init() {
        System.out.println("JavaMusicPlayer Initialized.");
    }

    // Вызывается только для синглтон бинов
    public void destroy() {
        System.out.println("JavaMusicPlayer Destroyed.");
    }

    public String playMusic(MusicGenre genre) {
        switch (genre) {
            case ROCK -> {
                return rockMusic.getSongName();
            }
            case INSTRUMENTAL -> {
                return instrumentalMusic.getSongName();
            }
            case AMBIENT -> {
                return ambientMusic.getSongName();
            }
        }
        return null;
    }

    public Music getAmbientMusic() {
        return ambientMusic;
    }

    public void setAmbientMusic(Music ambientMusic) {
        this.ambientMusic = ambientMusic;
    }

    public void getName() {
        System.out.println(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getVolume() {
        System.out.println(volume);
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
}
