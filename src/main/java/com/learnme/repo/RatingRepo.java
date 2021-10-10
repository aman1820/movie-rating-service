package com.learnme.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnme.model.Rating;

public interface RatingRepo extends JpaRepository<Rating, Long> {

}
