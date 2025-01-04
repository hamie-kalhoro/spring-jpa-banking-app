package net.worth.banking_app.service.impl;

import net.worth.banking_app.dto.AccountDto;
import net.worth.banking_app.repository.AccountRepository;
import net.worth.banking_app.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        return null;
    }
}
