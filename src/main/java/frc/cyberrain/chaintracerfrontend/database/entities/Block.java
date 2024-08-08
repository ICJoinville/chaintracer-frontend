package frc.cyberrain.chaintracerfrontend.database.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

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
}
