package com.example.carmarket.util;

import lombok.experimental.UtilityClass;

import java.util.Random;

@UtilityClass
public class CarMarkerUtils {
    public long generatedId() {
        return Math.abs(new Random().nextLong());
    }
}
