package com.learnme.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnme.model.Rating;
import com.learnme.repo.RatingRepo;

@Service
public class RatingService {

	@Autowired
	RatingRepo repo;
	
	public Rating getRatings(long userId) {
		Map<String, Integer> movieRating = new HashMap<String, Integer>();
		return repo.findById(userId).get();
	}

	public Rating addRating(Rating rating) {
		repo.save(rating);
		return null;
	}
}
