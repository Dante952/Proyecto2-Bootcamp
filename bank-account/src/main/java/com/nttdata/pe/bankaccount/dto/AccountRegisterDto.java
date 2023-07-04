package com.nttdata.pe.bankaccount.dto;

import com.nttdata.pe.bankaccount.model.Transaction;
import com.nttdata.pe.bankaccount.model.TypeAccount;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.List;

public class AccountRegisterDto {
    @Id
    @Indexed(unique = true)
    @NotEmpty(message = "{NotEmpty.customer.accountNumber}")
    @Pattern(regexp = "[a-zA-Z]{10}", message = "{Pattern.customer.accountNumber}")
    private String accountNumber;

    @NotEmpty(message = "{NotEmpty.customer.personalCustomer}")
    private String personalCustomer;

    @NotEmpty(message = "{NotEmpty.customer.amount}")
    private Double amount;

    @NotEmpty(message = "{NotEmpty.customer.amount}")
    private TypeAccount typeAccount;

    private List<Transaction> transactions;
}
