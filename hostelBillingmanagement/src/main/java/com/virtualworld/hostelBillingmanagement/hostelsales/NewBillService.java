package com.virtualworld.hostelBillingmanagement.hostelsales;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewBillService {

    @Autowired
    private NewBillRepository newBillRepository;

    public List<NewBill> getAllBills() {
        return newBillRepository.findAll();
    }

    public Optional<NewBill> getBillById(Long id) {
        return newBillRepository.findById(id);
    }

    public NewBill createBill(NewBill newBill) {
        return newBillRepository.save(newBill);
    }

    public NewBill updateBill(Long id, NewBill updatedBill) {
        if (newBillRepository.existsById(id)) {
            updatedBill.setId(id);
            return newBillRepository.save(updatedBill);
        }
        return null;
    }


    public void deleteBill(Long id) {
        newBillRepository.deleteById(id);
    }
}