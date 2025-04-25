package com.example.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpringbootCalculatorApplicationTests {

    @Autowired
    private CalculatorController controller;

    @Test
    void contextLoads() {
    }

    @Test
    void testAdd() {
        assertEquals(8, controller.add(5, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(2, controller.subtract(5, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(15, controller.multiply(5, 3));
    }

    @Test
    void testDivide() {
        assertEquals(5.0, controller.divide(10, 2));
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            controller.divide(5, 0);
        });
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }
}

