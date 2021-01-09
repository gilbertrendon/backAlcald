package com.user.crud.model;

import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.Table;

@Entity
public class User {
	@Id
	private int id;
	private int registred;
	private String name;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int isregistred() {
		return registred;
	}
	public void setRegistrado(int registrado) {
		this.registred = registrado;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public int getage() {
		return age;
	}
	public void setage(int edad) {
		this.age = edad;
	}
	
	public User() {
		
	}
	
	public User(int id, int registred, String name, int age) {
		super();
		this.id = id;
		this.registred = registred;
		this.name = name;
		this.age = age;
	}
	
}
