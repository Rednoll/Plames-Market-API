package com.inwaiders.plames.modules.market.domain.price;

import java.util.Collection;
import java.util.Map;

import com.inwaiders.plames.modules.wallet.domain.account.CurrencyAccount;
import com.inwaiders.plames.modules.wallet.domain.currency.Currency;

public interface Price {

	public boolean checkPurchaseOpportunity(Collection<CurrencyAccount> accounts);
	
	public void addCurrencyAmount(Currency currency, Long amount);
	public Map<Currency, Long> getCurrencies();
	
	public Price add(Price price);
	public Price add(Price... prices);
	public Price add(Collection<Price> prices);
	
	public Price multiply(double multiplier);
	
	public void save();
	public void delete();
}
