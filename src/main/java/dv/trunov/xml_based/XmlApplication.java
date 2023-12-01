package dv.trunov.xml_based;

import dv.trunov.MusicGenre;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collections;

public class XmlApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xml-based-context.xml");

        XmlComputer computer = context.getBean(XmlComputer.class);

        XmlMusicPlayer musicPlayer = computer.getMusicPlayer();
        musicPlayer.getName();
        musicPlayer.getVolume();
        System.out.println(Collections.singletonList(musicPlayer.getMusicList()));

        computer.runMusicPlayer(MusicGenre.INSTRUMENTAL);
        computer.runMusicPlayer(MusicGenre.ROCK);
        computer.runMusicPlayer(MusicGenre.AMBIENT);

        context.close();
    }
}
