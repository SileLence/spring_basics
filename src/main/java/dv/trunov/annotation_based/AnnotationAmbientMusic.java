package dv.trunov.annotation_based;

import dv.trunov.Music;
import org.springframework.stereotype.Component;

@Component
public class AnnotationAmbientMusic extends Music {

    @Override
    public String getSongName() {
        return "Ambient Music";
    }

    private void init() {
        System.out.println("AnnotationAmbientMusic Initialized.");
    }

    private void destroy() {
        System.out.println("AnnotationAmbientMusic Destroyed.");
    }
}
