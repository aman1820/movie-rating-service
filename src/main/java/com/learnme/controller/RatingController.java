package com.learnme.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learnme.model.Rating;
import com.learnme.service.RatingService;

@RestController
@RequestMapping("/rating")
public class RatingController {
	
	@Autowired
	RatingService ratingService;

	
	@GetMapping("/users/{userId}")
	public Rating getUserRating(@PathVariable("userId") long userId) {
		return	ratingService.getRatings(userId);
	}
	 
	@PostMapping(path = "/users", consumes = "application/json")
	public Rating addRating(@RequestBody Rating rating) {
		return ratingService.addRating(rating);
	}
	
	
}
