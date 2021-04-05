package com.costa.luiz.domain.payment;

public class PaymentService {

    void prepareForPayment(){}
    void requestPayment() {}
    void authorizePayment() {}
    void initiatePayment() {}
    void sendPayment() { }
    void sendPaymentInstructions() { }

    void debitAccountAndTransferFunds(Account buyer, Account seller, double amount){
        buyer.balanceOperation(Operation.DEBIT, amount);
        creditAccount(seller, amount);
    }

    void creditAccount(Account account, double amount) {
        account.balanceOperation(Operation.CREDIT, amount);
    }

    void advicePaymentCredit(){}
    void advicePaymentDebit(){}
    void acknowledgeDebitAndReconcile(){}
    void acknowledgeCreditAndReconcile(){}
}
