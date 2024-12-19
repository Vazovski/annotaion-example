package ru.study.model.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class RequestExample {

    @NotNull
    private String someText;

//    @NotEmpty
//    private String additionalText;
}
