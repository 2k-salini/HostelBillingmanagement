package com.virtualworld.hostelBillingmanagement.hostelsales;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("newbills")
@CrossOrigin(origins = "*")
public class NewBillController {

    @Autowired
    private NewBillService newBillService;

    @GetMapping
    public List<NewBill> getAllBills() {
        return newBillService.getAllBills();
    }

    @GetMapping("/{id}")
    public ResponseEntity<NewBill> getBillById(@PathVariable Long id) {
        Optional<NewBill> bill = newBillService.getBillById(id);
        return bill.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public NewBill createBill(@RequestBody NewBill newBill) {
        return newBillService.createBill(newBill);
    }

    @PutMapping("/{id}")
    public ResponseEntity<NewBill> updateBill(@PathVariable Long id, @RequestBody NewBill newBillDetails) {
        NewBill updatedBill = newBillService.updateBill(id, newBillDetails);
        return updatedBill != null ? ResponseEntity.ok(updatedBill) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBill(@PathVariable Long id) {
        newBillService.deleteBill(id);
        return ResponseEntity.noContent().build();
    }
}