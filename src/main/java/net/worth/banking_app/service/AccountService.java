package net.worth.banking_app.service;

import net.worth.banking_app.dto.AccountDto;

public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long id);
}
