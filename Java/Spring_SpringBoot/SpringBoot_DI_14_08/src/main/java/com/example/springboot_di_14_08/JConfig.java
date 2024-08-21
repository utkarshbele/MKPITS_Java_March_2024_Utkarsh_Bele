package com.example.springboot_di_14_08;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JConfig {
    @Bean
    public Account loanAcc()
    {
        return new LoanAcc();
    }
}
