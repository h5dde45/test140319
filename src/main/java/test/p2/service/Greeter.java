package test.p2.service;

import org.springframework.stereotype.Service;

@Service
public class Greeter {
    private final GreeterTarget target;

//    @Autowired
    public Greeter( GreeterTarget newTarget) {
        this.target = newTarget;
    }

    public final String greet() {
        return "Hello " + target.get();
    }
}
