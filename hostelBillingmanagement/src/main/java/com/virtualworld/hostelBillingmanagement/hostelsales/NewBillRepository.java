package com.virtualworld.hostelBillingmanagement.hostelsales;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewBillRepository extends JpaRepository<NewBill, Long> {
}