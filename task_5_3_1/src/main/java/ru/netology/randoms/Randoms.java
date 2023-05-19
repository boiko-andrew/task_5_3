package ru.netology.randoms;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;

    private int min;
    private int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        this.random = new Random();
    }

    @NotNull
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                int randomNum;
                randomNum = random.nextInt((max - min) + 1) + min;
                return randomNum;
            }
        };
    }
}