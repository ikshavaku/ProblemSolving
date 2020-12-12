package com.backdoor;

public class Backdoor {
	String username;
	String address;
	
	public Backdoor(String username, String address){
		this.username=username;
		this.address=address;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public String getAddress() {
		return this.address;
	}
}
