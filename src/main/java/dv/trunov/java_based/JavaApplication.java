package dv.trunov.java_based;

import dv.trunov.MusicGenre;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xml-based-context.xml");

        Computer computer = context.getBean(Computer.class);

        MusicPlayer musicPlayer = computer.getMusicPlayer();
        musicPlayer.getName();
        musicPlayer.getVolume();

        computer.runMusicPlayer(MusicGenre.INSTRUMENTAL);
        computer.runMusicPlayer(MusicGenre.ROCK);
        computer.runMusicPlayer(MusicGenre.AMBIENT);

        context.close();

        AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        AmbientMusic ambientMusic = annotationContext.getBean(AmbientMusic.class);
        System.out.println(ambientMusic.getSongName());

        annotationContext.close();
    }
}
