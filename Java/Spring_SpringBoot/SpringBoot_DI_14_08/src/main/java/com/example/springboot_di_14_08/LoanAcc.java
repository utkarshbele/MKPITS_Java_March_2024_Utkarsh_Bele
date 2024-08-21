package com.example.springboot_di_14_08;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


public class LoanAcc implements Account{

    @Override
    public String getAccount() {
        return "This is a Loan Account";
    }
}
