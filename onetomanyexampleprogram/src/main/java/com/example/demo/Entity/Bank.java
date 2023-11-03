package com.example.demo.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Bank {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@Column(name="account_num")
	private String accno;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="c_id",referencedColumnName = "id")
	List<Customers> c=new ArrayList<>();

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bank(String name, String accno) {
		super();
		this.name = name;
		this.accno = accno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccno() {
		return accno;
	}

	public void setAccno(String accno) {
		this.accno = accno;
	}

	public List<Customers> getC() {
		return c;
	}

	public void setC(List<Customers> c) {
		this.c = c;
	}
	
}
