package com.virtualworld.hostelBillingmanagement.hostelprofile;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
@Entity
@Table(name = "Hostel_profile")
public class Register {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    @Column(name = "customer_name")
	    private String customerName;
	    @Column(name = "shop_name")
	    private String shopName;
	    @Column(name = "customer_phno")
	    private String customerPhno;
	    private String registerName;
	    @Column(name = "company_address")
	    private String companyAddress;
	   
	    @Lob
	    @Column(name = "companyLogo", columnDefinition = "LONGBLOB")
	    private String companyLogo;
	    @Column(name = "company_location")
	    private String companyLocation;
	    @Column(name = "company_pincode")
	    private String companyPincode;
	    @Column(name = "company_type")
	    private String companyType;
	    @Column(name = "email_id")
	    private String emailId;
	    @Column(name = "role")
	    private String role;
	    @Column(name = "website")
	    private String website;
	    @Column(name = "gst_number")
	    private String gstNumber;
	    @Column(name = "password")
	    private String password;
	    @Column(name = "confirm_password")
	    private String confirmPassword;
	    @Column(name = "register_number")
	    private String registerNumber;
	    @Column(name = "account_name")
	    private String accountName; 
	    @Column(name = "bank_name")
	    private String bankName;
	    @Column(name = "account_number")
	    private String accountNumber;
	    @Column(name = "account_type")
	    private String accountType;
	    @Column(name = "ifsc_code")
	    private String ifscCode;
	    @Column(name = "branch")
	    private String branch;
	    public Register() {
	    	
		}
		public Register(Long id, String customerName, String shopName, String customerPhno,
		 String companyAddress, String companyLogo, String companyLocation,
				String companyPincode, String companyType, String emailId, String role, String website,
				String gstNumber, String password, String confirmPassword, String registerNumber, String accountName,
				String bankName, String accountNumber, String accountType, String ifscCode, String branch,String registerName) {
		
			this.id = id;
			this.customerName = customerName;
			this.shopName = shopName;
			this.customerPhno = customerPhno;
			this.companyAddress = companyAddress;
			this.companyLogo = companyLogo;
			this.companyLocation = companyLocation;
			this.companyPincode = companyPincode;
			this.companyType = companyType;
			this.emailId = emailId;
			this.role = role;
			this.website = website;
			this.gstNumber = gstNumber;
			this.password = password;
			this.confirmPassword = confirmPassword;
			this.registerNumber = registerNumber;
			this.accountName = accountName;
			this.bankName = bankName;
			this.accountNumber = accountNumber;
			this.accountType = accountType;
			this.ifscCode = ifscCode;
			this.branch = branch;
			this.registerName=registerName;
		}
		public Long getId() {
			return id;
		}
		public String getRegisterName() {
			return registerName;
		}
		public void setRegisterName(String registerName) {
			this.registerName = registerName;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public String getShopName() {
			return shopName;
		}
		public void setShopName(String shopName) {
			this.shopName = shopName;
		}
		public String getCustomerPhno() {
			return customerPhno;
		}
		public void setCustomerPhno(String customerPhno) {
			this.customerPhno = customerPhno;
		}
		
		public String getCompanyAddress() {
			return companyAddress;
		}
		public void setCompanyAddress(String companyAddress) {
			this.companyAddress = companyAddress;
		}
		public String getCompanyLogo() {
			return companyLogo;
		}
		public void setCompanyLogo(String companyLogo) {
			this.companyLogo = companyLogo;
		}
		public String getCompanyLocation() {
			return companyLocation;
		}
		public void setCompanyLocation(String companyLocation) {
			this.companyLocation = companyLocation;
		}
		public String getCompanyPincode() {
			return companyPincode;
		}
		public void setCompanyPincode(String companyPincode) {
			this.companyPincode = companyPincode;
		}
		public String getCompanyType() {
			return companyType;
		}
		public void setCompanyType(String companyType) {
			this.companyType = companyType;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public String getWebsite() {
			return website;
		}
		public void setWebsite(String website) {
			this.website = website;
		}
		public String getGstNumber() {
			return gstNumber;
		}
		public void setGstNumber(String gstNumber) {
			this.gstNumber = gstNumber;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getConfirmPassword() {
			return confirmPassword;
		}
		public void setConfirmPassword(String confirmPassword) {
			this.confirmPassword = confirmPassword;
		}
		public String getRegisterNumber() {
			return registerNumber;
		}
		public void setRegisterNumber(String registerNumber) {
			this.registerNumber = registerNumber;
		}
		public String getAccountName() {
			return accountName;
		}
		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}
		public String getBankName() {
			return bankName;
		}
		public void setBankName(String bankName) {
			this.bankName = bankName;
		}
		public String getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}
		public String getAccountType() {
			return accountType;
		}
		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}
		public String getIfscCode() {
			return ifscCode;
		}
		public void setIfscCode(String ifscCode) {
			this.ifscCode = ifscCode;
		}
		public String getBranch() {
			return branch;
		}
		public void setBranch(String branch) {
			this.branch = branch;
		}

}