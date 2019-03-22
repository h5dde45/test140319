package test.p4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import test.p4.config.SpringConfig;
import test.p4.entities.AmbiguousAutowiredFine;

public final class App {
    public static void main(final String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        AmbiguousAutowiredFine bean = context.getBean(AmbiguousAutowiredFine.class);
        System.out.println(bean.getFine());

    }
}