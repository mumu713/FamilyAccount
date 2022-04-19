package com.fa.dto;

/**
 * @author Administrator
 *
 */
public class Item {
	private int itemID;
	private String itemName;
	private String itemType;
	
	public Item(){
		super();
	}
	
	public Item(String name,String type){
		this.itemName=name;
		this.itemType=type;
	}
	
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	
	
	
}
