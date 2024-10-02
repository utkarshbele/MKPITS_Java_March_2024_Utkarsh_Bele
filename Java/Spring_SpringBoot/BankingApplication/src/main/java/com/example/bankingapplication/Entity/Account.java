package com.example.bankingapplication.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String accountNumber;
    private BigDecimal balance;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

//    @ManyToOne
//    @JoinColumn(name = "branch_id")
//    private Branch branch;
//
//    @ManyToOne
//    @JoinColumn(name = "account_type_id")
//    private AccountType accountType;
//
//    private Timestamp createdDate;
}
