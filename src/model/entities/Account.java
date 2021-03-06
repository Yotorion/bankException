package model.entities;

import model.exceptions.DomainException;

public class Account {
	
	//Attributes--------------------------------------
	
	private Integer number;
	private String  holder;
	private Double  balance;
	private Double  withdrawLimit;
	
	//Methods ----------------------------------------
	
	public void deposit(Double quantity) {
		this.balance += quantity;
	}
	
	public void withdraw(Double quantity) throws DomainException {
		if (quantity > withdrawLimit) {
			throw new DomainException("The amount exceeds withdraw limit.");
		} 
		
		else if (quantity > balance) {
			throw new DomainException("Not enough balance.");
		}
			
		this.balance -= quantity;
	}
	
	//Constructs -------------------------------------
	
	public Account() {
		
	}
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	
	//Getters & Setters ------------------------------

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

}
