package com.costa.luiz.domain.payment;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Account")
class AccountShould {

    @Test
    void account() {
        final Account lebowski = new Account("Dude", "42", 1_000_000d);
        assertAll(() -> {
            assertNotNull(lebowski.getBalance());
            assertNotNull(lebowski.getIban());
            assertNotNull(lebowski.getName());
        });
    }
}