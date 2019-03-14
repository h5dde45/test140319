package test.p2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import test.p2.config.ContextConfiguration;
import test.p2.service.Greeter;

public final class App {

    public static void main(final String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ContextConfiguration.class);
        Greeter greeter = (Greeter) context.getBean(Greeter.class);

        System.out.println(greeter.greet());
    }
}
