package dv.trunov.java_based;

import dv.trunov.Music;
import org.springframework.stereotype.Component;

//@Component
public class JavaAmbientMusic extends Music {

    @Override
    public String getSongName() {
        return "Ambient Music";
    }
}
