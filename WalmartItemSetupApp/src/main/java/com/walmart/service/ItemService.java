package com.walmart.service;

import java.util.List;
import com.walmart.entity.Item;

public interface ItemService {

	public abstract List<Item> getAllItems();

	public abstract Item getItemByItemId(Integer id);

	public abstract List<Item> findByItemType(String itemType);
	
	public abstract List<Item> findByWhichPartyFulfilled(String whichPartyFulfilled);
	
	public abstract Item saveItem(Item item);
}
