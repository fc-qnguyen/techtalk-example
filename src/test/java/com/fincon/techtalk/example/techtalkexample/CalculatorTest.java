package com.fincon.techtalk.example.techtalkexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void sum() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.sum(1, 2));
    }
}