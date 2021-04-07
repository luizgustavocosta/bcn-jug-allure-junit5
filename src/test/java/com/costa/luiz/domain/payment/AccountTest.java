package com.costa.luiz.domain.payment;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("Account")
@Feature("Account")
class AccountTest {

    @ParameterizedTest
    @MethodSource("operations")
    @DisplayName("Balance")
    void balanceOperation(Operation operation, double balance, double amountOperation, double expectedBalance) {
        final Account account = new Account("John Doe", "1", balance);
        account.balanceOperation(operation, amountOperation);
        assertEquals(expectedBalance, account.getBalance());

    }

    static Stream<Arguments> operations() {
        return Stream.of(
                arguments(Operation.CREDIT, 100d, 200d, 300d),
                arguments(Operation.DEBIT, 400d, 100d, 300d)
        );
    }

}