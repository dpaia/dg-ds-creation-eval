package com.example;

public final class HealthCheck {
    private HealthCheck() {
    }

    public static String status() {
        return "ok";
    }
}
