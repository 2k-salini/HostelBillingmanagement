package com.virtualworld.hostelBillingmanagement.hostelprofile;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

    @Autowired
    private RegisterRepository registerRepository;

    public List<Register> getAllRegisters() {
        return registerRepository.findAll();
    }

    public Optional<Register> getRegisterById(Long id) {
        return registerRepository.findById(id);
    }

    public Register createRegister(Register register) {
        return registerRepository.save(register);
    }

    public Register updateRegister(Long id, Register registerDetails) {
        Optional<Register> optionalRegister = registerRepository.findById(id);
        if (optionalRegister.isPresent()) {
            Register register = optionalRegister.get();
            register.setCustomerName(registerDetails.getCustomerName());
            register.setShopName(registerDetails.getShopName());
            register.setCustomerPhno(registerDetails.getCustomerPhno());
            register.setCompanyAddress(registerDetails.getCompanyAddress());
            register.setCompanyLogo(registerDetails.getCompanyLogo());
            register.setCompanyLocation(registerDetails.getCompanyLocation());
            register.setCompanyPincode(registerDetails.getCompanyPincode());
            register.setCompanyType(registerDetails.getCompanyType());
            register.setEmailId(registerDetails.getEmailId());
            register.setWebsite(registerDetails.getWebsite());
            register.setRole(registerDetails.getRole());
            register.setGstNumber(registerDetails.getGstNumber());
            register.setPassword(registerDetails.getPassword());
            register.setConfirmPassword(registerDetails.getConfirmPassword());
            register.setRegisterNumber(registerDetails.getRegisterNumber());
            register.setBankName(registerDetails.getBankName());
            register.setAccountName(registerDetails.getAccountName());
            register.setAccountType(registerDetails.getAccountType());
            register.setAccountNumber(registerDetails.getAccountNumber());
            register.setIfscCode(registerDetails.getIfscCode());
            register.setBranch(registerDetails.getBranch());
            return registerRepository.save(register);
        } else {
            throw new RuntimeException("Register not found with id " + id);
        }
    }

    public void deleteRegister(Long id) {
        registerRepository.deleteById(id);
    }
}