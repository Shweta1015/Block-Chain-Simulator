package com.example.blockchain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

public class Transaction {
    @Field("sender")
    private String sender;

    @Field("recipient")
    private String recipient;

    @Field("amount")
    private double amount;

    @Field("signature")
    private String signature;

    public Transaction(){}

    // Custom constructor without signature
    public Transaction(String sender, String recipient, double amount){
        this.sender = sender;
        this.recipient = recipient;
        this.amount = amount;
    }

    public Transaction(String sender, String recipient, double amount, String signature){
        this.sender = sender;
        this.recipient = recipient;
        this.amount = amount;
        this.signature = signature;
    }

    public String getSender(){
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
