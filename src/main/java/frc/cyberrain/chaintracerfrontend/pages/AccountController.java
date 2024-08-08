package frc.cyberrain.chaintracerfrontend.pages;

import frc.cyberrain.chaintracerfrontend.database.entities.Account;
import frc.cyberrain.chaintracerfrontend.database.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/account")
public class AccountController {
    @Autowired
    private AccountRepository accountRepository;

    @GetMapping("/")
    public Iterable<Account> index() {
        return accountRepository.findAll();
    }
}
