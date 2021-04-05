package com.costa.luiz.domain.payment;

/**
 * This is a fake controller
 */
public class PaymentController {

    private final PaymentService service;

    public PaymentController(PaymentService service) {
        this.service = service;
    }

    String transferFunds(Account buyer, Account seller, double amount) {
        service.debitAccountAndTransferFunds(buyer, seller, amount);
        return "Operation successfully";
    }

    String requestPayment() {
        throw new UnsupportedOperationException("Not available");
    }
}
