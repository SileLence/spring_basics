package dv.trunov.java_based;

import dv.trunov.Music;
import org.springframework.context.annotation.*;

import java.util.List;

@Configuration
@ComponentScan("dv.trunov.java_based")
@PropertySource("classpath:application.properties")
public class JavaSpringConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public JavaAmbientMusic ambientMusic() {
        return new JavaAmbientMusic();
    }

    @Bean
    public JavaInstrumentalMusic instrumentalMusic() {
        return JavaInstrumentalMusic.getInstrumentalMusic();
    }

    @Bean
    public JavaRockMusic rockMusic() {
        return new JavaRockMusic();
    }

    @Bean
    public List<Music> musicList() {
        return List.of(ambientMusic(), rockMusic(), instrumentalMusic());
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    @Scope("prototype")
    public JavaMusicPlayer musicPlayer() {
        JavaMusicPlayer musicPlayer = new JavaMusicPlayer(rockMusic(), instrumentalMusic());
        musicPlayer.setAmbientMusic(ambientMusic());
        musicPlayer.setMusicList(musicList());
        return  musicPlayer;
    }

    @Bean
    public JavaComputer computer() {
        return new JavaComputer(musicPlayer());
    }
}
