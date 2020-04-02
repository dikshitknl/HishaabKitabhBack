package com.cotiviti.HisabKitabh.models;

import java.time.LocalDateTime;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table
public class ProductDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	private Category category;
	
	@Transient
	private String categoryName;
	
	@ManyToOne
	private Brand brand;
	
	@Transient
	private String brandName;
	
	@ManyToOne
	private Vendor vendor;
	
	@Transient
	private String vendorName;
	
	@CreationTimestamp
	private LocalDateTime created;
	
	private String name;
	private String barCode;
	private Calendar mfgDate;
	private Calendar expDate;
	private Integer qty;
	private String unit;
	private Float costRate;
	private Float profitMargin;
	private Float sellRate;
	
	public ProductDetails() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public Calendar getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(Calendar mfgDate) {
		this.mfgDate = mfgDate;
	}

	public Calendar getExpDate() {
		return expDate;
	}

	public void setExpDate(Calendar expDate) {
		this.expDate = expDate;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Float getCostRate() {
		return costRate;
	}

	public void setCostRate(Float costRate) {
		this.costRate = costRate;
	}

	public Float getProfitMargin() {
		return profitMargin;
	}

	public void setProfitMargin(Float profitMargin) {
		this.profitMargin = profitMargin;
	}

	public Float getSellRate() {
		return sellRate;
	}

	public void setSellRate(Float sellRate) {
		this.sellRate = sellRate;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	
	

	
}
