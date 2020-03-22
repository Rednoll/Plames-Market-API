package com.inwaiders.plames.modules.market.domain.item;

import java.util.Set;

import com.inwaiders.plames.modules.market.domain.price.Price;

public interface Item {

	public void setName(String name);
	public String getName();
	
	public Set<String> getAliases();
	
	public void setPrice(Price price);
	public Price getPrice();
	
	public void setMetadata(String meta);
	public String getMetadata();
	
	public void setTargetApplicationName(String tan);
	public String getTargetApplicationName();
	
	public void save();
	public void delete();
	
	public Long getId();
	
	public static Item create() {
		
		return ItemHlRepository.getRepository().create();
	}
	
	public static Item getByMetadata(String meta) {
	
		return ItemHlRepository.getRepository().getByMetadata(meta);
	}
}