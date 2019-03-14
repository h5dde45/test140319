package test.p2.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class CoinImpl implements Coin {
    private final Random random;

//    @Autowired
    public CoinImpl( Random random) {
        this.random = random;
    }

    @Override
    public boolean toss() {
        return random.nextBoolean();
    }
}
