package demo2;

import demo2.config.ApplicationConfig;
import demo2.config.Instance;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {

    public static void main(String[] Args){

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        //Engine engine = context.getBean("bean01",Engine.class);
        //engine.runner();

        Instance instance = context.getBean(Instance.class);

        instance.startInstance();

    }

}
