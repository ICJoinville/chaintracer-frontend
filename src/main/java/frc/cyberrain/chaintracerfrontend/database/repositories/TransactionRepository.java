package frc.cyberrain.chaintracerfrontend.database.repositories;

import frc.cyberrain.chaintracerfrontend.database.entities.Account;
import frc.cyberrain.chaintracerfrontend.database.entities.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transaction, String> {}
