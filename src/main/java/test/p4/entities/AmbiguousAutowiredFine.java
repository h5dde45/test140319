package test.p4.entities;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class AmbiguousAutowiredFine {
    @Autowired
    private List<Fine> fine;

    public String getFine() {
        return "Two options: " + fine.stream()
                .map(Fine::whatIsFine)
                .collect(Collectors.joining(" and "));
    }
//    @Autowired
//    @Qualifier("fineDay")
//    private Fine fine;
//
//    public String getFine() { return fine.whatIsFine(); }
}
