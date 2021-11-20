package com.infinix.hiringChallange.controller;

import com.infinix.hiringChallange.dto.BillDto;
import com.infinix.hiringChallange.models.Bill;
import com.infinix.hiringChallange.service.BillService;
import com.infinix.hiringChallange.util.ApiResponse;
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
