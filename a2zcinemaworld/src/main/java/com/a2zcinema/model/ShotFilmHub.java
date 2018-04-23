package com.a2zcinema.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="short_film_hub")
public class ShotFilmHub {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="short_film_hub_id")
	private int short_film_hub_id;
	@Column(name="short_film_name")
	private String short_film_name;
	@Column(name="short_film_language")
	private String short_film_language;
	@Column(name="short_film_url")
	private String short_film_url;
	public int getShort_film_hub_id() {
		return short_film_hub_id;
	}
	public void setShort_film_hub_id(int short_film_hub_id) {
		this.short_film_hub_id = short_film_hub_id;
	}
	public String getShort_film_name() {
		return short_film_name;
	}
	public void setShort_film_name(String short_film_name) {
		this.short_film_name = short_film_name;
	}
	public String getShort_film_language() {
		return short_film_language;
	}
	public void setShort_film_language(String short_film_language) {
		this.short_film_language = short_film_language;
	}
	public String getShort_film_url() {
		return short_film_url;
	}
	public void setShort_film_url(String short_film_url) {
		this.short_film_url = short_film_url;
	}

}
