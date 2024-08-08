package frc.cyberrain.chaintracerfrontend.pages;

import frc.cyberrain.chaintracerfrontend.database.entities.Account;
import frc.cyberrain.chaintracerfrontend.database.repositories.AccountRepository;
import frc.cyberrain.chaintracerfrontend.database.repositories.BlockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    BlockRepository blockRepository;

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("blocks", blockRepository.findAll());
        return mv;
    }


}
