package dv.trunov.java_based;

import dv.trunov.Music;

public class JavaAmbientMusic extends Music {

    @Override
    public String getSongName() {
        return "Ambient Music";
    }

    private void init() {
        System.out.println("JavaAmbientMusic Initialized.");
    }

    private void destroy() {
        System.out.println("JavaAmbientMusic Destroyed.");
    }
}
