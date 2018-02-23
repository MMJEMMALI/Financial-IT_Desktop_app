package tn.esprit.Finance_It_Team_server.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class CurrencyAccount implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
private int id;
private int amount;
private int sumIncome;
private int sumExpenses;
@OneToOne
private Trader traders;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}

public Trader getTraders() {
	return traders;
}
public void setTraders(Trader traders) {
	this.traders = traders;
}
public int getSumIncome() {
	return sumIncome;
}
public void setSumIncome(int sumIncome) {
	this.sumIncome = sumIncome;
}
public int getSumExpenses() {
	return sumExpenses;
}
public void setSumExpenses(int sumExpenses) {
	this.sumExpenses = sumExpenses;
}
}
