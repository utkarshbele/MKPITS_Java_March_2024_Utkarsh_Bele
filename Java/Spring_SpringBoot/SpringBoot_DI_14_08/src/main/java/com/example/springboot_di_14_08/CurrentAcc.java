package com.example.springboot_di_14_08;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component@Lazy
public class CurrentAcc implements Account{

    @Override
    public String getAccount() {
        return "This is Current Account";
    }
}
