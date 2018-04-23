package com.a2zcinema.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movie_distribution")
public class MovieDistribution {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="movie_dist_id")
	private int movie_dist_id;
	@Column(name="theater_name")
	private String theater_name;
	@Column(name="theater_owner_name")
	private String theater_owner_name;
	@Column(name="theater_address")
	private String theater_address;
	@Column(name="theater_state")
	private String theater_state;
	@Column(name="theater_city")
	private String theater_city;
	@Column(name="theater_rent_time")
	private String theater_rent_time;
	public int getMovie_dist_id() {
		return movie_dist_id;
	}
	public void setMovie_dist_id(int movie_dist_id) {
		this.movie_dist_id = movie_dist_id;
	}
	public String getTheater_name() {
		return theater_name;
	}
	public void setTheater_name(String theater_name) {
		this.theater_name = theater_name;
	}
	public String getTheater_owner_name() {
		return theater_owner_name;
	}
	public void setTheater_owner_name(String theater_owner_name) {
		this.theater_owner_name = theater_owner_name;
	}
	public String getTheater_address() {
		return theater_address;
	}
	public void setTheater_address(String theater_address) {
		this.theater_address = theater_address;
	}
	public String getTheater_state() {
		return theater_state;
	}
	public void setTheater_state(String theater_state) {
		this.theater_state = theater_state;
	}
	public String getTheater_city() {
		return theater_city;
	}
	public void setTheater_city(String theater_city) {
		this.theater_city = theater_city;
	}
	public String getTheater_rent_time() {
		return theater_rent_time;
	}
	public void setTheater_rent_time(String theater_rent_time) {
		this.theater_rent_time = theater_rent_time;
	}
	

}
