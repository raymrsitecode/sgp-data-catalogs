package com.sgp.catalogs.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sgc_t005_msi")
public class MsiEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int msi_id;
	
	private String description;
	
	public int getMsi_id() {
		return msi_id;
	}
	public void setMsi_id(int msi_id) {
		this.msi_id = msi_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "MsiEntity [msi_id=" + msi_id + ", description=" + description + "]";
	}
	
	

}
