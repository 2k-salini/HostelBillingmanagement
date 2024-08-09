package com.virtualworld.hostelBillingmanagement.newregister;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewRegisterRepository extends JpaRepository<NewRegister, Long> {
}