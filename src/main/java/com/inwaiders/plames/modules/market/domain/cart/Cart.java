package com.inwaiders.plames.modules.market.domain.cart;

import java.util.Collection;

import com.inwaiders.plames.api.user.User;
import com.inwaiders.plames.modules.market.domain.stack.ItemStack;

public interface Cart {
	
	public void addItemStack(ItemStack is);
	
	public ItemStack getItemStackById(long id);
	
	public Collection<ItemStack> getItemStacks();
	
	public boolean isEmpty();
	
	public User getOwner();
	
	public String getTargetApplicationName();
	
	public void save();
	
	public void delete();
	
	public void loadFromJson(String json);
	public String toJson();
	
	public static Cart getCart(User user, String targetApplicationName) {
		
		CartHlRepository repository = CartHlRepository.getRepository(targetApplicationName);
			
			if(repository == null) {
				
				return null;
			}
				
		return repository.getCart(user);
	}
}
