package org.decembrist.controllerspractice.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BodyDto {
    private int number;

    @JsonCreator
    public BodyDto(@JsonProperty("even-number") int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
