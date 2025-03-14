package com.walmart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.walmart.entity.Item;
import com.walmart.exception.NoItemsAvailableException;
import com.walmart.service.ItemService;

@RestController
@RequestMapping("/api/v2/item")
public class ItemController {

	@Autowired
	private ItemService itemService;

	@GetMapping("/getAllItems")
	public ResponseEntity<List<Item>> getAllItems() {
		List<Item> allItems = itemService.getAllItems();
		if (allItems == null)
			throw new NoItemsAvailableException("No Items exist exception");
		return new ResponseEntity<>(allItems, HttpStatus.OK);
	}

	@GetMapping("/getItemByItemId")
	public ResponseEntity<Item> getItemByItemId(@RequestParam("itemId") Integer itemId) {
		Item item = itemService.getItemByItemId(itemId);
		return new ResponseEntity<Item>(item, HttpStatus.OK);
	}

	@GetMapping("/findByItemType/{itemType}")
	public ResponseEntity<List<Item>> findByItemType(@PathVariable("itemType") String itemType) {
		return new ResponseEntity<List<Item>>(itemService.findByItemType(itemType), HttpStatus.OK);
	}

	@GetMapping("/findByWhichPartyFulfilled")
	public ResponseEntity<List<Item>> findByWhichPartyFulfilled(@RequestParam("whichPartyFulfilled") String whichPartyFulfilled) {
		return new ResponseEntity<List<Item>>(itemService.findByWhichPartyFulfilled(whichPartyFulfilled),
				HttpStatus.OK);
	}

	@PostMapping("/save")
	public ResponseEntity<Item> saveItem(@RequestBody Item item) {
		return new ResponseEntity<Item>(itemService.saveItem(item), HttpStatus.OK);
	}
}
