package org.decembrist.controllerspractice.dto;

import com.fasterxml.jackson.annotation.JsonGetter;

public class PathVariableDto {
    private String pathVariable;

    public PathVariableDto(String pathVariable) {
        this.pathVariable = pathVariable;
    }

    @JsonGetter("path-variable")
    public String getPathVariable() {
        return pathVariable;
    }
}
