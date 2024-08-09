package frc.cyberrain.chaintracerfrontend.pages;

import frc.cyberrain.chaintracerfrontend.database.repositories.AccountRepository;
import frc.cyberrain.chaintracerfrontend.database.repositories.BlockRepository;
import frc.cyberrain.chaintracerfrontend.database.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @Autowired
    BlockRepository blockRepository;
    @Autowired
    private TransactionRepository transactionRepository;
    @Autowired
    private AccountRepository accountRepository;

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("blocks", blockRepository);
        mv.addObject("transactions", transactionRepository);
        mv.addObject("accounts", accountRepository);
        return mv;
    }


}
