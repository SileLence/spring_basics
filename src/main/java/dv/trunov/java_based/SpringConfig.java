package dv.trunov.java_based;

import dv.trunov.xml_based.XmlAmbientMusic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("dv.trunov")
@PropertySource("classpath:application.properties")
public class SpringConfig {

    @Bean
    public XmlAmbientMusic ambientMusic() {
        return new XmlAmbientMusic();
    }
}
