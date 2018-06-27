package com.thinkxfactor.zomatoplus.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.Restaurant;
import com.thinkxfactor.zomatoplus.models.User;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
	
	@PostMapping("/create")
	public Restaurant create(@RequestBody Restaurant user) {
		System.out.println(user.toString());
		
		return user;
	}
	
	
//	@GetMapping("/getall")
//	public List<Restaurant> userLogin() {
//		Restaurant user1=new Restaurant("1","Arsalan","2654");
//		Restaurant user2=new Restaurant("2","McDonalds","8952");
//		Restaurant user3=new Restaurant("3","Dominos","12365");
//		List userList=new ArrayList<>();
//		userList.add(user1);
//		userList.add(user2);
//		userList.add(user3);
//		return userList;
//	}
	
}