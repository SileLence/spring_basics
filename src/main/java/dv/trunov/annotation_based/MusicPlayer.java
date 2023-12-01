package dv.trunov.annotation_based;

import dv.trunov.Music;
import dv.trunov.MusicGenre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class MusicPlayer {

    private String name;
    private int volume;
    private final Music rockMusic;
    private final Music instrumentalMusic;

    @Autowired
    @Qualifier("ambientMusic")
    private Music ambientMusic;
    private List<Music> musicList;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music rockMusic,
                       @Qualifier("instrumentalMusic") Music instrumentalMusic) {
        this.rockMusic = rockMusic;
        this.instrumentalMusic = instrumentalMusic;
    }

    public void init() {
        System.out.println("Music Player Initialized.");
    }

    // Вызывается только для синглтон бинов
    public void destroy() {
        System.out.println("Music Player Destroyed.");
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
