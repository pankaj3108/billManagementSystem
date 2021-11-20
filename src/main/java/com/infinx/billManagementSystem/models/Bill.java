package com.infinx.billManagementSystem.models;

import com.infinx.billManagementSystem.dto.BillDto;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "BILL_INFO")
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int billNumber;
    @Column(name = "CUSTOMER_NAME")
    private @NotNull String billedTo;
    @Column(name = "BILL_DATE")
    private @NotNull Date billDate;
    @Column(name = "BILL_DUE_DATE")
    private String billDueDate;
    @Column(name = "BILL_AMOUNT")
    private double billedPrice;
    @Column(name = "TAX_AMOUNT")
    private double taxOnBill;
    @Column(name = "BILL_TOTAL_AMOUNT")
    private double totalAmount;

    public Bill(){

    }

    public Bill(BillDto billDto, Date billDate) {

        this.billedTo = billDto.getBilledTo();
        this.billDate = billDate;
        this.billDueDate = billDto.getBillDueDate();
        this.billedPrice = billDto.getBilledPrice();
        this.taxOnBill = billDto.getTaxPrice();
        this.totalAmount = this.billedPrice + this.taxOnBill;

    }

    public int getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(int billNumber) {
        this.billNumber = billNumber;
    }

    public String getBilledTo() {
        return billedTo;
    }

    public void setBilledTo(String billedTo) {
        this.billedTo = billedTo;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
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

    public double getTaxOnBill() {
        return taxOnBill;
    }

    public void setTaxOnBill(double taxOnBill) {
        this.taxOnBill = taxOnBill;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
