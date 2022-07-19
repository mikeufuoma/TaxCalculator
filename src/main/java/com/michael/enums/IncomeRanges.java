package com.michael.enums;

public enum IncomeRanges {
    FIRST(25000, 0),
    SECOND(50000, 5),
    THIRD(Integer.MAX_VALUE, 10);

    private final int income_;
    private final int taxRate_;

    IncomeRanges(int income, int taxRate){
        income_ = income;
        taxRate_ = taxRate;
    }

    public int getIncome(){
        return income_;
    }

    public int getTaxRate(){
        return taxRate_;
    }
}
