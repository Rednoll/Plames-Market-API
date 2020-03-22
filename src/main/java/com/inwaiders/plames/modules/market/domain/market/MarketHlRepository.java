package com.inwaiders.plames.modules.market.domain.market;

import com.inwaiders.plames.dao.EntityLink;
import com.inwaiders.plames.dao.HighLevelRepository;

public abstract class MarketHlRepository<T extends Market> implements HighLevelRepository<T> {

	private static MarketHlRepository repository = new MarketHlRepository.Empty();
	
	public abstract T create(String tan);
	public abstract T getById(Long id);
	
	public static void setRepository(MarketHlRepository rep) {
		
		repository = rep;
	}
	
	public static MarketHlRepository getRepository() {
		
		return repository;
	}
	
	private static class Empty extends MarketHlRepository {
		
		@Override
		public void save(Object obj) {

		}
		
		public Market create(String tan) {
			
			return null;
		}
		
		public Market getById(Long id) {
			
			return null;
		}

		@Override
		public EntityLink getLink(Object entity) {
			
			return null;
		}
	}
}
