package dv.trunov.annotation_based;

import dv.trunov.Music;
import org.springframework.stereotype.Component;

//@Component
public class AmbientMusic extends Music {

    @Override
    public String getSongName() {
        return "Ambient Music";
    }
}
