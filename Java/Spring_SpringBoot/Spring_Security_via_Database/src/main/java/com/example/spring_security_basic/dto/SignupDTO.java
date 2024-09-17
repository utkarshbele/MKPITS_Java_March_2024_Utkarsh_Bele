package com.example.spring_security_basic.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.antlr.v4.runtime.misc.NotNull;

@Getter
@Setter
@ToString
public class SignupDTO {
    @NotNull
    private String username;
    @NotNull
    private String password;
    private String authority;
}
