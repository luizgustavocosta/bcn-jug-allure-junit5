package com.costa.luiz.domain.payment.allure;

import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.parameter;

class AllureTestParameterTest {

    @Test
    public void allureOneTestParameterTest() {
        parameter("test param", "value");
    }

    @Test
    public void allureTestParametersTest() {
        parameter("test param1", "value1");
        parameter("test param2", "value2");
        parameter("test param3", "value3");
    }

}