package com.virtualworld.hostelBillingmanagement.newregister;

import java.util.List;

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
@RequestMapping("/newregister")
@CrossOrigin(origins = "*")
public class NewRegisterController {

    @Autowired
    private NewRegisterService newRegisterService;

    @PostMapping
    public NewRegister createNewRegister(@RequestBody NewRegister newRegister) {
        return newRegisterService.save(newRegister);
    }

    @GetMapping
    public List<NewRegister> getAllNewRegisters() {
        return newRegisterService.findAll();
    }

    @GetMapping("/{id}")
    public NewRegister getNewRegisterById(@PathVariable Long id) {
        return newRegisterService.findById(id);
    }
    @PutMapping("/{id}")
    public ResponseEntity<NewRegister> updateRegister(@PathVariable Long id, @RequestBody NewRegister newRegisterDetails) {
        try {
            NewRegister updatedRegister = newRegisterService.updateRegister(id, newRegisterDetails);
            return ResponseEntity.ok(updatedRegister);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }}
    @DeleteMapping("/{id}")
    public void deleteNewRegister(@PathVariable Long id) {
        newRegisterService.deleteById(id);
    }
}