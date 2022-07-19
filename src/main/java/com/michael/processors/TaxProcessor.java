package com.michael.processors;

import com.michael.enums.IncomeRanges;

public class TaxProcessor {
    private int income_;

    public TaxProcessor(int income){
        income_ = income;
    }

    public void printBreakDown() {
        int taxRate = getTaxRate();
        int tax = getTaxAmount(taxRate);
        System.out.println("Gross Income: "+income_);
        System.out.println("Tax Rate: "+taxRate+"%");
        System.out.println("Tax Amount: "+tax);
        System.out.println("Net Income: "+(income_-tax));
    }

    private int getTaxAmount(int taxRate){
        int taxAmount = (income_ * taxRate)/100;
        return taxAmount;
    }

    private int getTaxRate(){
        for(IncomeRanges eachRange: IncomeRanges.values()){
            if(income_ <= eachRange.getIncome())
                return eachRange.getTaxRate();
        }
        return 0;
    }
}
