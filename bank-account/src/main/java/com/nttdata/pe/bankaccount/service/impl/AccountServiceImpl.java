package com.nttdata.pe.bankaccount.service.impl;

import com.nttdata.pe.bankaccount.model.Account;
import com.nttdata.pe.bankaccount.repository.AccountRepository;
import com.nttdata.pe.bankaccount.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
@Transactional
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;
    @Override
    public Flux<Account> getAll() {
        return this.accountRepository.findAll();
    }

    @Override
    public Mono<Account> save(Account account) {
        return this.accountRepository.save(account);
    }

    @Override
    public Mono<Account> update(String dni, Account account) {
        return null;
    }

    @Override
    public Mono<Account> delete(String id) {
        return null;
    }

    @Override
    public Mono<Account> findByDni(String dni) {
        return null;
    }
}
