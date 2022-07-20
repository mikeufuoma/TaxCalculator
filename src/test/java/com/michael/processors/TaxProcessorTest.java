package com.michael.processors;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;

@TestInstance(Lifecycle.PER_CLASS)
public class TaxProcessorTest {
    private int income = 38000;
    private TaxProcessor processor;

    @BeforeAll
    private void createProcessor(){
        processor = new TaxProcessor(income);
    }

    @Test
    public void getTaxRateTest(){
        assertEquals(processor.getTaxRate(),5);
    }

    @Test
    public void getTaxAmount(){
        assertEquals(processor.getTaxAmount(processor.getTaxRate()), 2000);
    }
}
