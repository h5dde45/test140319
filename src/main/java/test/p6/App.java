package test.p6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import test.p6.config.AppConfig;
import test.p6.entities.PrototypeBean;
import test.p6.entities.SingletonBean;

public final class App {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);

        SingletonBean firstSingleton = context.getBean(SingletonBean.class);
        PrototypeBean firstPrototype = firstSingleton.getPrototypeBean();
        Thread.sleep(111);
        // get singleton bean instance one more time
        SingletonBean secondSingleton = context.getBean(SingletonBean.class);
        PrototypeBean secondPrototype = secondSingleton.getPrototypeBean();

        if (firstPrototype.equals(secondPrototype)) {
            System.out.println("The same instance should be returned");
        }


    }
}