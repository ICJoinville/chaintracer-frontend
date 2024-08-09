package frc.cyberrain.chaintracerfrontend.database.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
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

    @OneToMany(mappedBy = "block", fetch = FetchType.EAGER, targetEntity = Transaction.class) @JsonIgnore
    private List<Transaction> transactions = new ArrayList<>();

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
        return Collections.unmodifiableList(transactions);
    }
}
