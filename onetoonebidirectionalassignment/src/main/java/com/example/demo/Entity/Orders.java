package com.example.demo.Entity;

import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="order")
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="date_created")
	private Date datecreated;
	@Column(name="last_updated")
	private Date lastupdated;
	@Column(name="order_tracking_number")
	private String ordertrackingnum;
	private String status;
	@Column(name="total_price")
	private BigDecimal totalprice;
	@Column(name="total_quantity")
	private int totalquantity;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "order",fetch = FetchType.LAZY)
	private Addresses ads;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDatecreated() {
		return datecreated;
	}
	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}
	public Date getLastupdate() {
		return lastupdated;
	}
	public void setLastupdate(Date lastupdate) {
		this.lastupdated = lastupdate;
	}
	public String getOrdtracknum() {
		return ordertrackingnum;
	}
	public void setOrdtracknum(String orrdertrackingnum) {
		this.ordertrackingnum = orrdertrackingnum;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public BigDecimal getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(BigDecimal totalprice) {
		this.totalprice = totalprice;
	}
	public int getTotalquqntity() {
		return totalquantity;
	}
	public void setTotalquqntity(int totalquantity) {
		this.totalquantity = totalquantity;
	}
	public Addresses getAds() {
		return ads;
	}
	public void setAds(Addresses ads) {
		this.ads = ads;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", datecreated=" + datecreated + ", lastupdate=" + lastupdated + ", ordtracknum="
				+ ordertrackingnum + ", status=" + status + ", totalprice=" + totalprice + ", totalquqntity=" + totalquantity
				+ ", ads=" + ads + "]";
	}
	
	

}
