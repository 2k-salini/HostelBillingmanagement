package com.virtualworld.hostelBillingmanagement.hostelprofile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterRepository extends JpaRepository<Register, Long> {

	Register findByEmailId(String username);
   
}