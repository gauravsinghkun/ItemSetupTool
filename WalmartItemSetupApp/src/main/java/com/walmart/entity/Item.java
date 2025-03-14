package com.walmart.entity;

import java.util.Arrays;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Item")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer itemId;
	private String itemType;
	private String[] enabledStores;
	private Integer sellerId;
	private String whichPartyFulfilled;

	public Item() {
		super();
		System.out.println("Item.Item()");
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String[] getEnabledStores() {
		return enabledStores;
	}

	public void setEnabledStores(String[] enabledStores) {
		this.enabledStores = enabledStores;
	}

	public Integer getSellerId() {
		return sellerId;
	}

	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}

	public String getWhichPartyFulfilled() {
		return whichPartyFulfilled;
	}

	public void setWhichPartyFulfilled(String whichPartyFulfilled) {
		this.whichPartyFulfilled = whichPartyFulfilled;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemType=" + itemType + ", enabledStores=" + Arrays.toString(enabledStores)
				+ ", sellerId=" + sellerId + ", whichPartyFulfilled=" + whichPartyFulfilled + "]";
	}
}
