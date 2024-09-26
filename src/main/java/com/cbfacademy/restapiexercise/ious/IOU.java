package com.cbfacademy.restapiexercise.ious;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ious")
public class IOU {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String borrower;

    @Column(nullable = false)
    private String lender;

    @Column(nullable = false)
    private BigDecimal amount;

    @Column(nullable = false)
    private Instant dateTime;

    // Getter for id
    public UUID getId() {
       return id;
    }
    // Getter and Setter for borrower
    public String getBorrower() {
       return borrower;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }
    
    // Getter and Setter for lender
    public String getLender() {
       return lender;
    }

    public void setLender(String lender) {
        this.lender = lender;
    }
    
    // Getter and Setter for amount
    public BigDecimal getAmount() {
       return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    
    // Getter and Setter for dateTime
    public Instant dateTime() {
       return dateTime;
    }
    public void setDateTime(Instant dateTime) {
       this.dateTime = dateTime;
    }
}
