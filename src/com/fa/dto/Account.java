package com.fa.dto;

import java.sql.Date;


public class Account {
	private int accountId;
	private Date accountDate;
	private float accountMoney;
	private String accountDesc;
	private String accountItemName;
	private String accountItemType;
	
	public Account(){
		super();
	}
	
	public Account(Date accountDate, float accountMoney,
			String accountDesc, String accountItemName, String accountItemType) {
		super();
		this.accountDate = accountDate;
		this.accountMoney = accountMoney;
		this.accountDesc = accountDesc;
		this.accountItemName = accountItemName;
		this.accountItemType = accountItemType;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public Date getAccountDate() {
		return accountDate;
	}

	public void setAccountDate(Date accountDate) {
		this.accountDate = accountDate;
	}

	public float getAccountMoney() {
		return accountMoney;
	}

	public void setAccountMoney(float accountMoney) {
		this.accountMoney = accountMoney;
	}

	public String getAccountDesc() {
		return accountDesc;
	}

	public void setAccountDesc(String accountDesc) {
		this.accountDesc = accountDesc;
	}

	public String getAccountItemName() {
		return accountItemName;
	}

	public void setAccountItemName(String accountItemName) {
		this.accountItemName = accountItemName;
	}

	public String getAccountItemType() {
		return accountItemType;
	}

	public void setAccountItemType(String accountItemType) {
		this.accountItemType = accountItemType;
	}
	
	
	
	}
