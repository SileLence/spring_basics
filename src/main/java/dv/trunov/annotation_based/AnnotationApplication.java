package dv.trunov.annotation_based;

import dv.trunov.MusicGenre;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotation-based-context.xml");

        Computer computer = context.getBean(Computer.class);

        MusicPlayer musicPlayer = computer.getMusicPlayer();
        musicPlayer.getName();
        musicPlayer.getVolume();

        computer.runMusicPlayer(MusicGenre.INSTRUMENTAL);
        computer.runMusicPlayer(MusicGenre.ROCK);
        computer.runMusicPlayer(MusicGenre.AMBIENT);

        context.close();
    }
}
