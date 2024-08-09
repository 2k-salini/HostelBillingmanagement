package com.virtualworld.hostelBillingmanagement.hostelsales;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class NewBill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate date;
    private String roomNo;
    private Double powerUsedFrom;
    private Double powerUsedTo;
    private Double rentForMonth;
    private String mobileNumber;
    private String emailId;
    private Double currentAmount;
    private String role;
    private Double total;
    private Long billNo;
    private String others;

    // No-argument constructor
    public NewBill() {
    }

    // All-argument constructor
    public NewBill(String name, LocalDate date, String roomNo, Double powerUsedFrom, Double powerUsedTo, 
                   Double rentForMonth, String mobileNumber, String emailId, Double currentAmount, 
                   String role, Double total, Long billNo,String others) {
        this.name = name;
        this.date = date;
        this.roomNo = roomNo;
        this.powerUsedFrom = powerUsedFrom;
        this.powerUsedTo = powerUsedTo;
        this.rentForMonth = rentForMonth;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
        this.currentAmount = currentAmount;
        this.role = role;
        this.total = total;
        this.billNo = billNo;
        this.others=others;
    }

   
	// Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public Double getPowerUsedFrom() {
        return powerUsedFrom;
    }

    public void setPowerUsedFrom(Double powerUsedFrom) {
        this.powerUsedFrom = powerUsedFrom;
    }

    public Double getPowerUsedTo() {
        return powerUsedTo;
    }

    public void setPowerUsedTo(Double powerUsedTo) {
        this.powerUsedTo = powerUsedTo;
    }

    public Double getRentForMonth() {
        return rentForMonth;
    }

    public void setRentForMonth(Double rentForMonth) {
        this.rentForMonth = rentForMonth;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Double getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(Double currentAmount) {
        this.currentAmount = currentAmount;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Long getBillNo() {
        return billNo;
    }

    public void setBillNo(Long billNo) {
        this.billNo = billNo;
    }
    public String getOthers() {
		return others;
	}

	public void setOthers(String others) {
		this.others = others;
	}

}