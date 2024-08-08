package frc.cyberrain.chaintracerfrontend.pages;

import frc.cyberrain.chaintracerfrontend.database.entities.Block;
import frc.cyberrain.chaintracerfrontend.database.repositories.BlockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/block")
public class BlockController {
    @Autowired
    private BlockRepository blockRepository;

    @GetMapping("/")
    public Iterable<Block> index() {
        return blockRepository.findAll();
    }
}
