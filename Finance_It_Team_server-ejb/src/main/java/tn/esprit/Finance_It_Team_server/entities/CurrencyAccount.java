package tn.esprit.Finance_It_Team_server.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CurrencyAccount implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
private int id;
private int amount;
private int sum_income;
private int sum_expenses;
@ManyToOne
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
public int getSum_income() {
	return sum_income;
}
public void setSum_income(int sum_income) {
	this.sum_income = sum_income;
}
public int getSum_expenses() {
	return sum_expenses;
}
public void setSum_expenses(int sum_expenses) {
	this.sum_expenses = sum_expenses;
}
public Trader getTraders() {
	return traders;
}
public void setTraders(Trader traders) {
	this.traders = traders;
}
}
