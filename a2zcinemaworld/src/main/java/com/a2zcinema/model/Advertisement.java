package com.a2zcinema.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="advertising")
public class Advertisement {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="advertising_id")
	private int advertising_id;
	@Column(name="advertising_image")
	private String advertising_image;
	@Column(name="adds_type")
	private String adds_type;
	public int getAdvertising_id() {
		return advertising_id;
	}
	public void setAdvertising_id(int advertising_id) {
		this.advertising_id = advertising_id;
	}
	public String getAdvertising_image() {
		return advertising_image;
	}
	public void setAdvertising_image(String advertising_image) {
		this.advertising_image = advertising_image;
	}
	public String getAdds_type() {
		return adds_type;
	}
	public void setAdds_type(String adds_type) {
		this.adds_type = adds_type;
	}

}
