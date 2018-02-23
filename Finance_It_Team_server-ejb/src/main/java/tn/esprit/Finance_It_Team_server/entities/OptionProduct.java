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
 private int strikePrice;
 private int currentPrice;
 @Enumerated(EnumType.STRING)
 private TypeOption typeoption;
 @Temporal(TemporalType.TIMESTAMP)
 private Date expirationDate;
 private float volatility;
 private float risk;
 private int time ;
 @Enumerated
 private StateOption stateOption;
@ManyToMany
private List <Trader>traders;
@Enumerated(EnumType.STRING)
private CategoryAsset categoryasset;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public TypeOption getTypeoption() {
	return typeoption;
}
public void setTypeoption(TypeOption typeoption) {
	this.typeoption = typeoption;
}
public Date getExpirationDate() {
	return expirationDate;
}
public void setExpirationDate(Date expirationDate) {
	this.expirationDate = expirationDate;
}
public List<Trader> getTraders() {
	return traders;
}
public void setTraders(List<Trader> traders) {
	this.traders = traders;
}
public CategoryAsset getCategoryasset() {
	return categoryasset;
}
public void setCategoryasset(CategoryAsset categoryasset) {
	this.categoryasset = categoryasset;
}
public int getStrikePrice() {
	return strikePrice;
}
public void setStrikePrice(int strikePrice) {
	this.strikePrice = strikePrice;
}
public int getCurrentPrice() {
	return currentPrice;
}
public void setCurrentPrice(int currentPrice) {
	this.currentPrice = currentPrice;
}
public float getVolatility() {
	return volatility;
}
public void setVolatility(float volatility) {
	this.volatility = volatility;
}



}
