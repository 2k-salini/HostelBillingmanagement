package com.virtualworld.hostelBillingmanagement.hostelprofile;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
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
@RequestMapping("registers")
@CrossOrigin(origins = "*")
public class RegisterController {

    @Autowired
    private RegisterService registerService;
    @Autowired
    private RegisterRepository registerRepository;

    @GetMapping
    public List<Register> getAllRegisters() {
        return registerService.getAllRegisters();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Register> getRegisterById(@PathVariable Long id) {
        Optional<Register> register = registerService.getRegisterById(id);
        if (register.isPresent()) {
            return ResponseEntity.ok(register.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @PostMapping(value = "/login",produces = MediaType.APPLICATION_JSON_VALUE)
     public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {

         Register register = registerRepository.findByEmailId(loginRequest.getUsername());
         HttpHeaders headers = new HttpHeaders();
         headers.setContentType(MediaType.APPLICATION_JSON);
         if (register != null && register.getPassword().equals(loginRequest.getPassword())) {
             
             return ResponseEntity.ok()
                     .headers(headers)
                     .body(new LoginResponse("Login successful", register));
         } else {
     
         	return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                     .headers(headers)
                     .body(new LoginResponse("Invalid username or password", null));

         }
     }
    
    
    @PostMapping
    public Register createRegister(@RequestBody Register register) {
        return registerService.createRegister(register);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Register> updateRegister(@PathVariable Long id, @RequestBody Register registerDetails) {
        try {
            Register updatedRegister = registerService.updateRegister(id, registerDetails);
            return ResponseEntity.ok(updatedRegister);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRegister(@PathVariable Long id) {
        registerService.deleteRegister(id);
        return ResponseEntity.noContent().build();
    }
}