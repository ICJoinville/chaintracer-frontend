package frc.cyberrain.chaintracerfrontend.pages;

import frc.cyberrain.chaintracerfrontend.database.entities.Transaction;
import frc.cyberrain.chaintracerfrontend.database.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/transaction")
public class TransactionController {
    @Autowired
    private TransactionRepository transactionRepository;

    @GetMapping("/")
    public Iterable<Transaction> index() {
        return transactionRepository.findAll();
    }

    @GetMapping("/{id}")
    public Transaction getTransaction(@PathVariable int id) {
        return transactionRepository.findById(id + "").get();
    }
}
