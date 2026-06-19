package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HealthCheckTest {
    @Test
    void reportsOkStatus() {
        assertEquals("ok", HealthCheck.status());
    }
}
