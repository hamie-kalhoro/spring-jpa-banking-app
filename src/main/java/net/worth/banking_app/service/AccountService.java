package net.worth.banking_app.service;

import net.worth.banking_app.dto.AccountDto;
import java.util.List;

public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccountById(Long id);
    AccountDto deposite(Long id, double amount);
    AccountDto withdraw(Long id, double amount);
    List<AccountDto> getAllAccounts();
}
