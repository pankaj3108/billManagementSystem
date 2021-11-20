package com.infinix.hiringChallange.dto;

import com.sun.istack.NotNull;

public class BillDto {
    private @NotNull String billedTo;
    private String billDueDate;
    private @NotNull double billedPrice;
    private @NotNull double taxPrice;

    public BillDto() {

    }

    public BillDto(String billedTo, String billDueDate, double billedPrice, double taxPrice) {
        this.billedTo = billedTo;
        this.billDueDate = billDueDate;
        this.billedPrice = billedPrice;
        this.taxPrice = taxPrice;
    }

    public String getBilledTo() {
        return billedTo;
    }

    public void setBilledTo(String billedTo) {
        this.billedTo = billedTo;
    }

    public String getBillDueDate() {
        return billDueDate;
    }

    public void setBillDueDate(String billDueDate) {
        this.billDueDate = billDueDate;
    }

    public double getBilledPrice() {
        return billedPrice;
    }

    public void setBilledPrice(double billedPrice) {
        this.billedPrice = billedPrice;
    }

    public double getTaxPrice() {
        return taxPrice;
    }

    public void setTaxPrice(double taxPrice) {
        this.taxPrice = taxPrice;
    }
}
