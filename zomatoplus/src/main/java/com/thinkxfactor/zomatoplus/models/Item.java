package com.thinkxfactor.zomatoplus.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Item {
@Id
@GeneratedValue
@Column(name="item_id")
private Long id;
@Column(name="restaurant_id")
private Long retaurantId;
@Column(name="name")
private String name;
@Column(name="price")
private Double price;
@Column(name="description")
private String description;
public Long getId()
{
	return id;
}
public Item(Long id, Long retaurantId, String name, Double price, String description) {
	super();
	this.id = id;
	this.retaurantId = retaurantId;
	this.name = name;
	this.price = price;
	this.description = description;
}
public Long getRetaurantId() {
	return retaurantId;
}
public void setRetaurantId(Long retaurantId) {
	this.retaurantId = retaurantId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public void setId(Long id) {
	this.id = id;
}

}
