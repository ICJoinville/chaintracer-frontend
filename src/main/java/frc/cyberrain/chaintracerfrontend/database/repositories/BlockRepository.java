package frc.cyberrain.chaintracerfrontend.database.repositories;

import frc.cyberrain.chaintracerfrontend.database.entities.Block;
import org.springframework.data.repository.CrudRepository;

public interface BlockRepository extends CrudRepository<Block, Long> {}
