package com.costa.luiz.domain.payment;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Feature - Payment methods")
/**
 * From  http://tfig.unece.org/contents/payment-methods.htm
 */
class PaymentMethodTest {

    @Test
    @Feature("Payment Methods")
    @Severity(SeverityLevel.CRITICAL)
    void paymentMethod() {
        goodServiceDelivery();
        initiation();
        settlementTransfer();
        fundsTransfer();
        receptionNotification();
    }

    @Step
    void goodServiceDelivery() { }
    @Step
    void initiation() { }
    @Step
    void fundsTransfer() { }
    @Step
    void settlementTransfer() { }
    @Step
    void receptionNotification() { }

}
