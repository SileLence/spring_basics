package dv.trunov.java_based;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("dv.trunov.java_based")
@PropertySource("classpath:application.properties")
public class JavaSpringConfig {

    @Bean
    public JavaAmbientMusic ambientMusic() {
        return new JavaAmbientMusic();
    }
}
