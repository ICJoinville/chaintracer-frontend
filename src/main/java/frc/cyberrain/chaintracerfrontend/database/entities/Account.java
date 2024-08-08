package frc.cyberrain.chaintracerfrontend.database.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;

import java.util.List;

@Entity(name = "accounts")
public class Account {

    @Id @Getter
    private String name;
    @Getter private int lastValue;
    @OneToMany(mappedBy = "id") @Getter private List<Transaction> transactions;
}
