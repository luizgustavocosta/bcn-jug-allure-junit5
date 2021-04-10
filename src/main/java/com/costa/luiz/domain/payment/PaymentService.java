package com.costa.luiz.domain.payment;

import com.costa.luiz.domain.infrastructure.Service;

@Service
public class PaymentService {

    void debitAccountAndTransferFunds(Account buyer, Account seller, double amount){
        buyer.balanceOperation(Operation.DEBIT, amount);
        creditAccount(seller, amount);
    }

    void creditAccount(Account account, double amount) {
        account.balanceOperation(Operation.CREDIT, amount);
    }

    void prepareForPayment(){
        throw new UnsupportedOperationException();
    }
    void requestPayment() {
        throw new UnsupportedOperationException();
    }
    void authorizePayment() {
        throw new UnsupportedOperationException();
    }
    void initiatePayment() {
        throw new UnsupportedOperationException();
    }
    void sendPayment() {
        throw new UnsupportedOperationException();
    }
    void sendPaymentInstructions() {
        throw new UnsupportedOperationException();
    }
    void advicePaymentCredit(){
        throw new UnsupportedOperationException();
    }
    void advicePaymentDebit(){
        throw new UnsupportedOperationException();
    }
    void acknowledgeDebitAndReconcile(){
        throw new UnsupportedOperationException();
    }
    void acknowledgeCreditAndReconcile(){
        throw new UnsupportedOperationException();
    }
}
