package net.worth.banking_app.service.impl;

import net.worth.banking_app.dto.AccountDto;
import net.worth.banking_app.entity.Account;
import net.worth.banking_app.mapper.AccountMapper;
import net.worth.banking_app.repository.AccountRepository;
import net.worth.banking_app.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    AccountRepository accountRepository;
    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }
}
