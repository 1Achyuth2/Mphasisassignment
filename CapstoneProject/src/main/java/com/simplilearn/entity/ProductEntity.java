package com.simplilearn.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

public class ProductEntity {
	
@Id	
@GeneratedValue(strategy= GenerationType.IDENTITY)
private int id;
private String FoodName;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFoodName() {
	return FoodName;
}
public void setFoodName(String foodName) {
	FoodName = foodName;
}

}
