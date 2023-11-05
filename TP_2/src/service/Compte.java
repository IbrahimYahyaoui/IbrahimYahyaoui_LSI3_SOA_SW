package service;

import java.util.Date;

public class Compte {
	private int code;
	private double solde;
	private Date date;
	public Compte(int code, double solde, Date dateCreation) {
		
		this.code = code;
		this.solde = solde;
		this.date = dateCreation;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Date getDateCreation() {
		return date;
	}
	public void setDateCreation(Date dateCreation) {
		this.date = dateCreation;
	}
	
	

}