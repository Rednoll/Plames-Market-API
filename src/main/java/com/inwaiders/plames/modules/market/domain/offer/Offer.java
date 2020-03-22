package com.inwaiders.plames.modules.market.domain.offer;

import java.util.Set;

import com.inwaiders.plames.api.user.User;
import com.inwaiders.plames.api.utils.DescribedFunctionResult;
import com.inwaiders.plames.modules.market.domain.price.Price;
import com.inwaiders.plames.modules.market.domain.stack.ItemStack;

public interface Offer {
	
	public DescribedFunctionResult buy(User user, int quantity);
	
	public void setItemStacks(Set<ItemStack> stacks);
	public Set<ItemStack> getItemStacks();
	
	public Price calcTotalPrice();
	
	public void setDiscount(double discount);
	public double getDiscount();
	
	public void setName(String name);
	public String getName();
	
	public void save();
	public void delete();
}
