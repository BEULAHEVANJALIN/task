package com.example.task;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "q_states")
public class State {
	@Id
	private String name;
	private String country;

	public String getName() {
		return name;
	}

	public String getCountry() {
		return country;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCountry_name(String country) {
		this.country = country;
	}
}
