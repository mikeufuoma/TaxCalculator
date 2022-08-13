package com.michael.enums;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IncomeRangesTest{

    @Test
    public void getTaxRateFirstTest(){
        assertEquals(IncomeRanges.FIRST.getTaxRate(),0);
    }

    @Test
    public void getTaxRateSecondTest(){
        assertEquals(IncomeRanges.SECOND.getTaxRate(),5);
    }

    @Test
    public void getTaxRateThirdTest(){
        assertEquals(IncomeRanges.THIRD.getTaxRate(),10);
    }

}