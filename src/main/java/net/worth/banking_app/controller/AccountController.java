package net.worth.banking_app.controller;

import net.worth.banking_app.dto.AccountDto;
import net.worth.banking_app.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/accounts/")
public class AccountController {

    AccountService accountService;
    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("add-account")
    public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto) {
        return new ResponseEntity<>(accountService.createAccount(accountDto), HttpStatus.CREATED);
    }

    @GetMapping("get-account/{id}")
    public ResponseEntity<AccountDto> getAccount(@PathVariable long id) {
        AccountDto accountById = accountService.getAccountById(id);
        return new ResponseEntity<>(accountById, HttpStatus.OK);
    }

}
