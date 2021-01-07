package com.user.crud.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class flight {
	@Id
	private int idflight;
	private String state;
	private Date hourinit;
	private Date hourend;
	private String cityinit;
	private String cityend;
	private int[] seats = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	
	public flight() {
	
	}
	
	
	public flight(int idflight, String state, Date hourinit, Date hourend, String cityinit, String cityend, 
			double cost) {
		
		super();
		this.idflight = idflight;
		this.state = state;
		this.hourinit = hourinit;
		this.hourend = hourend;
		this.cityinit = cityinit;
		this.cityend = cityend;
		this.cost = cost;
	}
	private double cost;
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
	public Date getHourinit() {
		return hourinit;
	}
	public void setHourinit(Date hourinit) {
		this.hourinit = hourinit;
	}
	public Date getHourend() {
		return hourend;
	}
	public void setHourend(Date hourend) {
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
	public int[] getSeats() {
		return seats;
	}
	public void setSeats(int[] seats) {
		this.seats = seats;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}

}
