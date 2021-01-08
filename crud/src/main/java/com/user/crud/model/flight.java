package com.user.crud.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class flight {
	@Id
	private int idflight;
	private String state;
	private String hourinit;
	private String hourend;
	private String cityinit;
	private String cityend;
	private int seats;
	private double cost;
	public flight() {
	
	}
	
	
	public flight(int idflight, String state, String hourinit, String hourend, String cityinit, String cityend,int seats, 
			double cost) {
		
		super();
		this.idflight = idflight;
		this.state = state;
		this.hourinit = hourinit;
		this.hourend = hourend;
		this.cityinit = cityinit;
		this.cityend = cityend;
		this.seats = seats;
		this.cost = cost;
	}

	public int getIdflight() {
		return idflight;
	}
	public void setIdflight(int idflight) {
		this.idflight = idflight;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getHourinit() {
		return hourinit;
	}
	public void setHourinit(String hourinit) {
		this.hourinit = hourinit;
	}
	public String getHourend() {
		return hourend;
	}
	public void setHourend(String hourend) {
		this.hourend = hourend;
	}
	public String getCityinit() {
		return cityinit;
	}
	public void setCityinit(String cityinit) {
		this.cityinit = cityinit;
	}
	public String getCityend() {
		return cityend;
	}
	public void setCityend(String cityend) {
		this.cityend = cityend;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}

}
