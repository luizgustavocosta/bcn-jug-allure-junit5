package com.costa.luiz.domain.payment.allure;

import org.junit.jupiter.api.*;

import static io.qameta.allure.Allure.step;

public class AllureFixtureTest {

    @BeforeAll
    public static void beforeAll() {
        step("Step inside beforeAll");
    }

    @BeforeEach
    public void beforeEach() {
        step("Step inside beforeEach");
    }

    @Test
    public void allureFixtureTest() {
        step("Step inside allureFixtureTest");
    }

    @Test
    public void allureFixtureTest2() {
        step("Step inside allureFixtureTest2");
    }

    @AfterEach
    public void afterEach() {
        step("Step inside afterEach");
    }

    @AfterAll
    public static void afterAll() {
        step("Step inside afterAll");
    }

}