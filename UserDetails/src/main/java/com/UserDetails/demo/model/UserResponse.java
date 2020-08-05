package com.UserDetails.demo.model;



public class UserResponse {

	
	private String fristName;
	private int addresses;
	
	public UserResponse(String fristName, int addresses) {
		super();
		this.fristName = fristName;
		this.addresses = addresses;
	}
	public String getFristName() {
		return fristName;
	}
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	public int getAddresses() {
		return addresses;
	}
	public void setAddresses(int addresses) {
		this.addresses = addresses;
	}
	
	
 

}
