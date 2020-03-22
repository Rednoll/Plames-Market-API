package com.inwaiders.plames.modules.market.domain.cart;

import java.util.HashMap;
import java.util.Map;

import com.inwaiders.plames.api.user.User;

public abstract class CartHlRepository {

	private static Map<String, CartHlRepository> repositories = new HashMap<>();
	
	public abstract Cart getCart(User user);
	public abstract String getTargetApplicationName();
	
	public static CartHlRepository getRepository(String targetApplicationName) {
		
		return repositories.get(targetApplicationName);
	}
	
	public static void addRepository(CartHlRepository repository) {
		
		repositories.put(repository.getTargetApplicationName(), repository);
	}
}
