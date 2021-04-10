package com.costa.luiz.domain.payment;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DisplayName("In memory store")
class InMemoryStoreTest {

    InMemoryStore inMemoryStore = new InMemoryStore();

    @Test
    void save() {
        inMemoryStore.save("");
        assertEquals(1, inMemoryStore.findAll().size());
    }

    @Test
    void delete() {
        inMemoryStore.save("");
        inMemoryStore.delete("");
        assertEquals(0, inMemoryStore.findAll().size());
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    void findAll() {
        assertNotNull(inMemoryStore.findAll());
    }
}