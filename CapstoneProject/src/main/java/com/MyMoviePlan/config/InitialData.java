package com.MyMoviePlan.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.simplilearn.entity.ProductEntity;
import com.simplilearn.repo.ProductRepo;

public class InitialData {
@Autowired
ProductRepo productRepo;

public List<ProductEntity> getAllProduct(){
	return productRepo.findAll();
}
public ProductEntity getProductById(int id) {
	return productRepo.findById(id).get();	
}
public void addProduct(ProductEntity object) {
	productRepo.save(object);
}
public void updateProduct(int id,ProductEntity entity) {
	if(productRepo.findById(id).isPresent()) {
		ProductEntity old=productRepo.findById(id).get();
		old.setFoodName(entity.getFoodName());
		productRepo.save(old);
	}
}
//public void deleteProduct(int id) {
	//return productRepo.deleteById(id).;	

	
//}
}
