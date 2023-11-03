package com.example.demo.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="userprofile")
public class Userprofile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="phone_no")
	private String phonenumber;
	private String address;
	
//	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "userpro")
	@JoinColumn(name="up_id")
	
	private User user;

	public Userprofile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Userprofile(String phonenumber, String address, User user) {
		super();
		this.phonenumber = phonenumber;
		this.address = address;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
