package com.walmart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walmart.dao.ItemRegistryDao;
import com.walmart.entity.Item;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRegistryDao dao;

	@Override
	public List<Item> getAllItems() {
		System.out.println("ItemServiceImpl.getAllItems()");
		return dao.getAllItems();
	}

	@Override
	public Item getItemByItemId(Integer id) {
		System.out.println("ItemServiceImpl.getItemByItemId()");
		return dao.getItemByItemId(id);
	}

	@Override
	public List<Item> findByItemType(String itemType) {
		System.out.println("ItemServiceImpl.findByItemType()");
		return dao.findByItemType(itemType);
	}

	@Override
	public List<Item> findByWhichPartyFulfilled(String whichPartyFulfilled) {
		System.out.println("ItemServiceImpl.findByWhichPartyFulfilled()");
		return dao.findByWhichPartyFulfilled(whichPartyFulfilled);
	}

	@Override
	public Item saveItem(Item item) {
		System.out.println("ItemServiceImpl.saveItem()");
		return dao.save(item);
	}
}
