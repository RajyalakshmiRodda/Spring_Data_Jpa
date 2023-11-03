package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Meesho {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
        private int id;
	@Column(name="pro_name")
        private String proname;
	@Column(name="pro_price")
        private int proprice;
	
	public Meesho() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Meesho(int id, String proname, int proprice) {
		super();
		this.id = id;
		this.proname = proname;
		this.proprice = proprice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProname() {
		return proname;
	}

	public void setProname(String proname) {
		this.proname = proname;
	}

	public int getProprice() {
		return proprice;
	}

	public void setProprice(int proprice) {
		this.proprice = proprice;
	}

	@Override
	public String toString() {
		return "Meesho [id=" + id + ", proname=" + proname + ", proprice=" + proprice + "]";
	}
	
        
}
