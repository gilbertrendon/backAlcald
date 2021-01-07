package com.user.crud.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class reserv {
	
	@Id
	private int idreserv;
	private int iduser;
	private int idflight;
	private int valid;//0 no, 1 si
	
	
	public reserv() {
		
	}	
	
	public reserv(int idreserv, int iduser, int idflight, int valid) {
		super();
		this.idreserv = idreserv;
		this.iduser = iduser;
		this.idflight = idflight;
		this.valid = valid;
	}
	
	public int getIdreserv() {
		return idreserv;
	}
	public void setIdreserv(int idreserv) {
		this.idreserv = idreserv;
	}
	public int getIduser() {
		return iduser;
	}
	public void setIduser(int iduser) {
		this.iduser = iduser;
	}
	public int getIdflight() {
		return idflight;
	}
	public void setIdflight(int idflight) {
		this.idflight = idflight;
	}
	public int getValid() {
		return valid;
	}
	public void setValid(int valid) {
		this.valid = valid;
	}
	

}
