package com.wipro.velocity.ims.model;

import java.util.Date;

public class DealerAddress {
	
	private Long id;
    private String email;
    private String fname;
    private String lname;
    private String password;
    private Date dob;
     private String phoneNo;

     private String street;
        private String city;
        private int pincode;
        
        
		public DealerAddress(Long id, String email, String fname, String lname, String password, Date dob,
				String phoneNo, String street, String city, int pincode) {
			this.id = id;
			this.email = email;
			this.fname = fname;
			this.lname = lname;
			this.password = password;
			this.dob = dob;
			this.phoneNo = phoneNo;
			this.street = street;
			this.city = city;
			this.pincode = pincode;
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getFname() {
			return fname;
		}


		public void setFname(String fname) {
			this.fname = fname;
		}


		public String getLname() {
			return lname;
		}


		public void setLname(String lname) {
			this.lname = lname;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public Date getDob() {
			return dob;
		}


		public void setDob(Date dob) {
			this.dob = dob;
		}


		public String getPhoneNo() {
			return phoneNo;
		}


		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}


		public String getStreet() {
			return street;
		}


		public void setStreet(String street) {
			this.street = street;
		}


		public String getCity() {
			return city;
		}


		public void setCity(String city) {
			this.city = city;
		}


		public int getPincode() {
			return pincode;
		}


		public void setPincode(int pincode) {
			this.pincode = pincode;
		}
        
        
}
