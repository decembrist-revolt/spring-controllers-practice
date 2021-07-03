package org.decembrist.controllerspractice.dto;

public class RandomValueDto {
    private final int randomValue;

    public RandomValueDto(int randomValue) {
        this.randomValue = randomValue;
    }

    public int getRandomValue() {
        return randomValue;
    }
}
