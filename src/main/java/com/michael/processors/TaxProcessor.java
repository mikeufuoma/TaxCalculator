package com.michael.processors;

import com.michael.enums.IncomeRanges;

public class TaxProcessor {
    private int income_;

    public TaxProcessor(int income){
        income_ = income;
    }

    public String getTaxBreakDown() {
        int taxRate = getTaxRate();
        int tax = getTaxAmount(taxRate);
        StringBuilder taxBreakDown = new StringBuilder();
        taxBreakDown.append("===================================");
        taxBreakDown.append("\n");
        taxBreakDown.append("Gross Income: "+income_);
        taxBreakDown.append("\n");
        taxBreakDown.append("Tax Rate: "+taxRate+"%");
        taxBreakDown.append("\n");
        taxBreakDown.append("Tax Amount: "+tax);
        taxBreakDown.append("\n");
        taxBreakDown.append("Net Income: "+(income_-tax));
        taxBreakDown.append("\n");
        taxBreakDown.append("===================================");
        return taxBreakDown.toString();
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
