package com.inwaiders.plames.modules.market.domain.stack;

import com.inwaiders.plames.modules.market.domain.item.Item;
import com.inwaiders.plames.modules.market.domain.price.Price;

public interface ItemStack extends Cloneable {
	
	public boolean businessEquals(ItemStack is);
	
	public void setItem(Item item);
	public Item getItem();

	public void setQuantity(int quantity);
	public int getQuantity();
	
	public void decrQuantity(int quantity);
	
	public String getMetadata();
	
	public Price getPrice();

	public void save();
	public void delete();
	
	public ItemStack clone();
	
	public Long getId();
}
