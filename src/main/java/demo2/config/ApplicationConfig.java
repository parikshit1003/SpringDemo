package demo2.config;

import demo2.Engine;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("demo2")
public class ApplicationConfig {

    @Bean
    public Engine engine1(){
        Engine engine = new Engine();
        engine.setId("0x11bf");
        return engine;
    }

    @Bean
    @Primary
    public Engine engine2(){
        return new Engine();
    }

    @Bean
    public Instance instance(Engine engine){ //Autowired
        Instance instance = new Instance();
        instance.setId(112205);
        instance.setEngine(engine);

        return instance;
    }

}
