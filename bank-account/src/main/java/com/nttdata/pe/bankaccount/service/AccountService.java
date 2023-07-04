package com.nttdata.pe.bankaccount.service;

import com.nttdata.pe.bankaccount.model.Account;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AccountService {
    Flux<Account> getAll();
    Mono<Account> save(Account account);

    Mono<Account> update(final String dni, Account account);

    Mono<Account> delete(final String id);

    Mono<Account> findByDni(String dni);
}
