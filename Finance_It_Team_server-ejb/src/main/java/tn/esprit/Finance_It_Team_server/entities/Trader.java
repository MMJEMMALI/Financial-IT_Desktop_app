package tn.esprit.Finance_It_Team_server.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
//import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue(value="typeTrader")
public class Trader extends User implements Serializable {
	
	@OneToOne(mappedBy = "trader")
	private Portfolio portfolio;
	
	
	private String scoring ;
private String statusTrader;

@ManyToMany(mappedBy="traders")
private List<OptionProduct> optionProduct;

@OneToOne(mappedBy="traders")
private CurrencyAccount currencyAccount;



public Portfolio getPortfolio() {
	return portfolio;
}
public void setPortfolio(Portfolio portfolio) {
	this.portfolio = portfolio;
}
public String getScoring() {
	return scoring;
}
public void setScoring(String scoring) {
	this.scoring = scoring;
}

public CurrencyAccount getCurrencyAccount() {
	return currencyAccount;
}
public void setCurrencyAccount(CurrencyAccount currencyAccount) {
	this.currencyAccount = currencyAccount;
}
public String getStatusTrader() {
	return statusTrader;
}
public void setStatusTrader(String statusTrader) {
	this.statusTrader = statusTrader;
}
public List<OptionProduct> getOptionProduct() {
	return optionProduct;
}
public void setOptionProduct(List<OptionProduct> optionProduct) {
	this.optionProduct = optionProduct;
}
}
