package com.globalpayex;

import com.globalpayex.banking.exceptions.LowBalanceException;

import java.util.Optional;

public class Accounts {
    private long accountNumber;
    private AccType accountType; // using string as enum
    private double accountBalance;

    public static final String ACCTYPE_SAVING = "Savings";
    public static final String ACCTYPE_CURRENT = "Current";

    public Accounts(){

    }

    public Accounts(long accountNumber, AccType accountType, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public AccType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccType accountType) {
//        if(accountType.equals(ACCTYPE_SAVING) || accountType.equals(ACCTYPE_CURRENT)) {
//            this.accountType = accountType;
//        }
        this.accountType=accountType;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "Accounts{" +
                "accountNumber=" + accountNumber +
                ", accountType='" + accountType + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }


    public double depositelogic(double d) {
        this.accountBalance +=d;
        return this.accountBalance;
    }

    public double withdrawlogic(double v) throws LowBalanceException{
        System.out.println("Transaction Start");
        try {
            if (v <= 0) {
                throw new IllegalArgumentException("amount passed needs to be positive and non zero");
            }
            if (this.accountBalance - v < 1000) {
                throw new LowBalanceException("Amount not withdraw due to less balance");
            }
            this.accountBalance -= v;
            return this.accountBalance;
        } finally {
            System.out.println("Transaction End");
        }
    }

    public Optional<String> getDetails(){
        if(this.accountNumber!=0){
            return Optional.of("Account Number : "+ this.accountNumber+"\nAccount Type : "+this.accountType+"\nAccount Balance : "+this.accountBalance);
        }
        return Optional.empty();
    }
}
