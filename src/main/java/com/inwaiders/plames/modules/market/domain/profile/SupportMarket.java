package com.inwaiders.plames.modules.market.domain.profile;

import com.inwaiders.plames.api.utils.DescribedFunctionResult;
import com.inwaiders.plames.modules.market.domain.cart.Cart;

public interface SupportMarket {

	public DescribedFunctionResult collectMarketCart(Cart cart);
}
