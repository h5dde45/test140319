package test.p1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import test.p1.days.Monday;
import test.p1.days.Thursday;
import test.p1.days.Wednesday;
import test.p1.days.WeekDay;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Configuration
@ComponentScan("test.p1.entities")
public class NewConfig {
    @Bean
    public WeekDay getDay() {
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        switch (dayOfWeek) {
            case MONDAY: return new Monday();
            case TUESDAY: return new Thursday();
            default: return new Wednesday();
        }
    }
//    @Bean
//    public Cat getCat(Parrot parrot) {
//        Cat cat = new Cat();
//        cat.setName(parrot.getName() + "- rrr");
//        return cat;
//    }
//
//    @Bean
//    public Dog dog() {
//        return new Dog();
//    }
//
//    @Bean("parrot-kesha")
//    public Parrot weNeedMoreParrots() {
//        return new Parrot();
//    }
}
