package com.virtualworld.hostelBillingmanagement.newregister;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewRegisterService {

    @Autowired
    private NewRegisterRepository newRegisterRepository;

    public NewRegister save(NewRegister newRegister) {
        return newRegisterRepository.save(newRegister);
    }

    public List<NewRegister> findAll() {
        return newRegisterRepository.findAll();
    }

    public NewRegister findById(Long id) {
        return newRegisterRepository.findById(id).orElse(null);
    }
    public NewRegister updateRegister(Long id, NewRegister newRegisterDetails) {
        if (newRegisterRepository.existsById(id)) {
            newRegisterDetails.setId(id);
            return newRegisterRepository.save(newRegisterDetails);
        } else {
            throw new RuntimeException("Register not found with id " + id);
        }
    }
    public void deleteById(Long id) {
        newRegisterRepository.deleteById(id);
    }
}