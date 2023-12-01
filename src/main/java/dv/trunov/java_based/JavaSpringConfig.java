package dv.trunov.java_based;

import dv.trunov.xml_based.XmlAmbientMusic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//@Configuration(value = "java-based")
//@ComponentScan("dv.trunov")
//@PropertySource("classpath:application.properties")
public class JavaSpringConfig {

    //@Bean
    public XmlAmbientMusic ambientMusic() {
        return new XmlAmbientMusic();
    }
}
