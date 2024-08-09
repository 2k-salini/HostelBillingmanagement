package com.virtualworld.hostelBillingmanagement.hostelprofile;
import com.fasterxml.jackson.annotation.JsonProperty;



public class LoginResponse {
	public LoginResponse(String message, Register register) {
		super();
		this.message = message;
		this.register = register;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Register getRegister() {
		return register;
	}
	public void setRegister(Register register) {
		this.register = register;
	}
	@JsonProperty("message")
	private String message;
	@JsonProperty("register")
    private Register register; 
    

}
