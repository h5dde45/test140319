package test.p2.service;

import org.springframework.stereotype.Service;

@Service
public class GreeterTargetImpl implements GreeterTarget {
    private final Coin coin;

    public GreeterTargetImpl( Coin newCoin) {
        this.coin = newCoin;
    }

    @Override
    public final String get() {
        if (coin.toss()) {
            return "World";
        }
        return "Spring";
    }
}