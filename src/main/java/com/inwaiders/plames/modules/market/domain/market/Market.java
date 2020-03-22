package com.inwaiders.plames.modules.market.domain.market;

import java.util.List;

import com.inwaiders.plames.modules.market.domain.item.Item;

public interface Market {
	
	public List<Item> getItems();
	public String getTargetApplicationName();
	public Long getId();
	
	public void save();
	public void delete();
	
	public static Market create(String tan) {
		
		return MarketHlRepository.getRepository().create(tan);
	}
	
	public static Market getById(long id) {
		
		return MarketHlRepository.getRepository().getById(id);
	}
}
