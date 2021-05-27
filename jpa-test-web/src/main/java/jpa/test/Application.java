package jpa.test;

import jpa.test.model.pojo.AdApplication;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@SpringBootApplication
public class Application implements ApplicationContextAware {

    public static void main(String[] args) {

        new SpringApplicationBuilder(Application.class).bannerMode(Banner.Mode.LOG).run(args);
        System.out.println("----");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Object applicationRepository = applicationContext.getBean("applicationRepository");
        System.out.println(applicationRepository);
    }
}
