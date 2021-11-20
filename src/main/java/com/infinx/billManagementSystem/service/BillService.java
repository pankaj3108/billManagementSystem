package com.infinx.billManagementSystem.service;

import com.infinx.billManagementSystem.dto.BillDto;
import com.infinx.billManagementSystem.models.Bill;
import com.infinx.billManagementSystem.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BillService {

    @Autowired
    private BillRepository billRepository;

    public List<Bill> fetchAllBills() {

        List<Bill> bills = this.billRepository.findAll();

        return bills;

    }

    public void addBill(BillDto billDto) {
        Bill bill = new Bill(billDto, new Date());

        this.billRepository.save(bill);
    }

    public Bill findBillById(Integer id) throws Exception {
        Optional<Bill> optionalBill = this.billRepository.findById(id);

        if(!optionalBill.isPresent())
            throw new Exception("Bill with given Id is not present");

        return optionalBill.get();
    }
}
