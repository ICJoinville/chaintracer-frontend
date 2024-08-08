package frc.cyberrain.chaintracerfrontend.database.entities;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity(name = "blocks")
public class Block {

    @Id
    private Long id;
    @Column(name = "previous_block")
    private int previous_block;
    @Column(name = "hash")
    private String hash;
    @Column(name = "previous_hash")
    private String previousHash;

    @OneToMany(mappedBy = "id")
    private List<Transaction> transactions;

    public Long getId() {
        return id;
    }

    public int getPreviousBlock() {
        return previous_block;
    }

    public String getHash() {
        return hash;
    }

    public String getPreviousHash() {
        return previousHash;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
