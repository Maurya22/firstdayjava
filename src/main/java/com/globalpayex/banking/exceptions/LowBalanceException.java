package com.globalpayex.banking.exceptions;

public class LowBalanceException extends Exception{

    public LowBalanceException(String message) {
        super(message);
    }
}
