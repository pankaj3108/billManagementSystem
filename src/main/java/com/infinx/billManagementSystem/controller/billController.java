package com.infinx.billManagementSystem.controller;

import com.infinx.billManagementSystem.dto.BillDto;
import com.infinx.billManagementSystem.models.Bill;
import com.infinx.billManagementSystem.service.BillService;
import com.infinx.billManagementSystem.util.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class billController {

    @Autowired
    private BillService billService;

    @PostMapping("/add_bill")
    public ResponseEntity<ApiResponse> addBill(@RequestBody BillDto billDto) {

        this.billService.addBill(billDto);

        return new ResponseEntity<ApiResponse>(new ApiResponse(true, "bill successfully created"), HttpStatus.CREATED);

    }

    @GetMapping("/bills/{id}")
    public ResponseEntity<Bill> findBill(@PathVariable int id) throws Exception {

        Bill bill = this.billService.findBillById(id);

        return new ResponseEntity<>(bill, HttpStatus.OK);

    }

    @GetMapping("/bills")
    public ResponseEntity<List<Bill>> getBills() {

        List<Bill> allBills = this.billService.fetchAllBills();

        return new ResponseEntity<List<Bill>>(allBills, HttpStatus.OK);

    }

}
