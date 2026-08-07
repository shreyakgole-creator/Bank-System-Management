package entity;

import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.OneToMany;

import  java.util.*;

public class Account
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int accountId;

    @Column(unique = true)
    private String accountNumber;

    private String accountType;

    private double balance;

    @ManyToOne
    @JoinColumn(name="customer_id")
    private Customer customer;

    @OneToMany(mappedBy="account", cascade= CascadeType.ALL)
    private List<Transaction> transactions=new ArrayList<>();

    public Account(){}

    public Account(String accountNumber,String accountType,double balance){
        this.accountNumber=accountNumber;
        this.accountType=accountType;
        this.balance=balance;
    }
}
