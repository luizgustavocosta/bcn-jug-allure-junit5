package com.costa.luiz.domain.payment;

import com.costa.luiz.domain.infrastructure.Controller;
import com.costa.luiz.domain.infrastructure.Requires;

import java.util.Objects;

@Controller
public class PaymentController {

    @Requires
    private final PaymentService service;

    public PaymentController(PaymentService service) {
        Objects.requireNonNull(service, "An instance of service is expected");
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
