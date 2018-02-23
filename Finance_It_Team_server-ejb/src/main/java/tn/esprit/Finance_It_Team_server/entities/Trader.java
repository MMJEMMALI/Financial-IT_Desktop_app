package tn.esprit.Finance_It_Team_server.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue(value="typeTrader")
public class Trader extends Users implements Serializable {
private String scoring ;
private String status_trader;
@ManyToMany(mappedBy="traders")
private List<OptionProduct> optionProduct;
@OneToMany(mappedBy="traders")
private List <CurrencyAccount> currencyAccount;

public String getScoring() {
	return scoring;
}
public void setScoring(String scoring) {
	this.scoring = scoring;
}
public String getStatus_trader() {
	return status_trader;
}
public void setStatus_trader(String status_trader) {
	this.status_trader = status_trader;
}

public List<CurrencyAccount> getCurrencyAccount() {
	return currencyAccount;
}
public void setCurrencyAccount(List<CurrencyAccount> currencyAccount) {
	this.currencyAccount = currencyAccount;
}
}
