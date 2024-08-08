package frc.cyberrain.chaintracerfrontend.database.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "accounts")
public class Account {

    @Id
    private String name;
    private int lastValue;

    public String getName() {
        return name;
    }

    public int getLastValue() {
        return lastValue;
    }
}
