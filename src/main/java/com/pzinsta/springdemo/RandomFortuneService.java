package com.pzinsta.springdemo;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("random")
public class RandomFortuneService implements FortuneService {

    private final static List<String> FORTUNES = Arrays.asList("Beware of the wolf in sheep's clothing",
            "Diligince is the mother of good luck", "The journey is the reward");
    
    @Override
    public String getFortune() {
        return FORTUNES.get(generateRandomFortunesIndex());
    }

    private int generateRandomFortunesIndex() {
        return ThreadLocalRandom.current().nextInt(FORTUNES.size());
    }

}
