package com.costa.luiz.domain.payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Payment Controller")
@ExtendWith(MockitoExtension.class)
class PaymentControllerTest {

    @Mock PaymentService service;

    @Test
    @DisplayName("Transfer funds")
    void transferFunds() {
        PaymentController paymentController = new PaymentController(service);
        Account buyer = new Account("BoJack", "123", 50d);
        Account seller = new Account("Mr Peanut butter", "456", 0);
        double amount = 42d;
        final String message = paymentController.transferFunds(buyer, seller, amount);
        assertEquals("Operation successfully", message);
    }

    @Test
    @DisplayName("Request payment")
    void requestPayment() {
    }
}