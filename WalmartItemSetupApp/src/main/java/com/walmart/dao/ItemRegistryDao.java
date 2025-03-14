package com.walmart.dao;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.walmart.entity.Item;

public interface ItemRegistryDao extends CrudRepository<Item, Integer> {

	@Query("from com.walmart.entity.Item")
	public abstract List<Item> getAllItems();

	@Query("from com.walmart.entity.Item where itemId=:id")
	public abstract Item getItemByItemId(Integer id);

	public abstract List<Item> findByItemType(String itemType);
	
	public abstract List<Item> findByWhichPartyFulfilled(String whichPartyFulfilled);
}
