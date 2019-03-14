package test.p1.entities;
import org.springframework.stereotype.Component;

@Component
public class Cat {
    private String name = "cat";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
