package com.inwaiders.plames.modules.market.domain.item;

import com.inwaiders.plames.dao.HighLevelRepository;

public abstract class ItemHlRepository<T extends Item> implements HighLevelRepository<T> {

	private static ItemHlRepository repository = null;
	
	public abstract T create();
	public abstract T getByMetadata(String meta);
	
	public static void setRepository(ItemHlRepository rep) {
		
		repository = rep;
	}
	
	public static ItemHlRepository getRepository() {
		
		return repository;
	}
}
