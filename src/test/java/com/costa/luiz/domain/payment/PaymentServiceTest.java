package com.costa.luiz.domain.payment;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;

@DisplayName("Payment Service")
@ExtendWith(MockitoExtension.class)
@Feature("Payment")
class PaymentServiceTest {

    PaymentService service;

    @Mock
    private Account buyer, seller;

    @BeforeEach
    void setUp() {
        service = new PaymentService();
    }

    @Test
    @DisplayName("Debit and transfer funds")
    @Severity(SeverityLevel.BLOCKER)
    void debitAccountAndTransferFunds() {
        double amount = 42;

        service.debitAccountAndTransferFunds(buyer, seller, amount);

        verify(buyer, atLeastOnce()).balanceOperation(Operation.DEBIT, amount);
        verify(seller, atLeastOnce()).balanceOperation(Operation.CREDIT, amount);

    }

    @Test
    @DisplayName("Credit account")
    @Severity(SeverityLevel.CRITICAL)
    void creditAccount() {
        Account account = new Account("Brian", "789", 0d);

        assertEquals(0, account.getBalance());

        service.creditAccount(account, 10d);
        assertEquals(10d, account.getBalance());
    }

    @Test
    @DisplayName("Prepare for payment")
    @Severity(SeverityLevel.NORMAL)
    void prepareForPayment() {
        Throwable throwable =
                assertThrows(
                        UnsupportedOperationException.class,
                        () -> service.prepareForPayment());
        assertNull(throwable.getMessage());
    }
}