package tn.esprit.Finance_It_Team_server.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.swing.plaf.BorderUIResource.EmptyBorderUIResource;

@Entity
public class OptionProduct implements Serializable{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)	
 private int id;
 private int strike_price;
 private int current_price;
 @Enumerated(EnumType.STRING)
 private Type_option typeoption;
 @Temporal(TemporalType.TIMESTAMP)
 private Date expiration_date;

@ManyToMany
private List <Trader>traders;
@Enumerated(EnumType.STRING)
private Categoryasset categoryasset;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getStrike_price() {
	return strike_price;
}
public void setStrike_price(int strike_price) {
	this.strike_price = strike_price;
}
public int getCurrent_price() {
	return current_price;
}
public void setCurrent_price(int current_price) {
	this.current_price = current_price;
}

public Date getExpiration_date() {
	return expiration_date;
}
public void setExpiration_date(Date expiration_date) {
	this.expiration_date = expiration_date;
}

public List<Trader> getTraders() {
	return traders;
}
public void setTraders(List<Trader> traders) {
	this.traders = traders;
}
public Categoryasset getCategoryasset() {
	return categoryasset;
}
public void setCategoryasset(Categoryasset categoryasset) {
	this.categoryasset = categoryasset;
}
public Type_option getTypeoption() {
	return typeoption;
}
public void setTypeoption(Type_option typeoption) {
	this.typeoption = typeoption;
}

}
