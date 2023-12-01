package dv.trunov;

import org.springframework.stereotype.Component;

@Component
public class AmbientMusic extends Music {

    @Override
    public String getSongName() {
        return "Ambient Music";
    }
}
