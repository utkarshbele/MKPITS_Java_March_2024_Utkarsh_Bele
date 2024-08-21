package com.example.springboot_di_14_08;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

@RestController
@Slf4j
public class DiController {
    private final Account sacc;
    private final Account cacc;
    private final Account lacc;

    //private static final org.slf4j.Logger log =
            //org.slf4j.LoggerFactory.getLogger(DiController.class);

    @Autowired
    public  DiController(@Qualifier("savingsAcc") Account sacc,
                         @Qualifier("currentAcc") Account cacc,
                         @Qualifier("loanAcc") Account lacc)
    {
        log.info("App Constructor has started!");
        this.sacc=sacc;
        this.cacc=cacc;
        this.lacc=lacc;
        log.info("App Constructor has ended!");
    }

    //we can do setter injection as well
//    @Autowired
//    public void setAcc(Account acc) {
//        this.acc = acc;
//    }
    @PostConstruct
    public void postConstructDisplay()
    {
        System.out.println("This is a post constructor method");
    }

    @GetMapping("/sdetails")
    public String getSavingDetails()
    {
        return sacc.getAccount();
    }
    @GetMapping("/cdetails")
    public String getCurrentDetails()
    {
        return cacc.getAccount();
    }
    @GetMapping("/ldetails")
    public String getLoanDetails()
    {
        return lacc.getAccount();
    }

    @PreDestroy
    public void preDestroy()
    {
        System.out.println("This is a pre destroy method");
    }
}
