package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testGreeting() {
        assertEquals(
            "Hello from GitHub Actions!",
            App.greet()
        );
    }
}
