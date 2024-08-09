package frc.cyberrain.chaintracerfrontend.database.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;

@Entity(name = "transactions")
public class Transaction {
    @Id @Getter
    private Long id;

    @JoinColumn(name = "account") @ManyToOne @Getter
    private Account account;
    @Getter private Long timestamp;
    @Getter private int value;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "block_id") @Getter private Block block;
}
