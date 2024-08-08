package frc.cyberrain.chaintracerfrontend.database.repositories;

import frc.cyberrain.chaintracerfrontend.database.entities.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, String> {}
