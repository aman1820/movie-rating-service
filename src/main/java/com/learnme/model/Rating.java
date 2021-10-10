package com.learnme.model;

import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;

@Entity
@Table(name = "user_rating")
public class Rating {
	
	@Id
	private long userId;
	@ElementCollection
	@MapKeyColumn(name = "movieId")
    @Column(name = "rating")
	@CollectionTable(name="movie_rating", joinColumns=@JoinColumn(name = "userId"))
	private Map<String, Integer> movieRating;
	
	public Rating() {
	}
	

	public Rating(long userId, Map<String, Integer> movieRating) {
		super();
		this.userId = userId;
		this.movieRating = movieRating;
	}


	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public Map<String, Integer> getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(Map<String, Integer> movieRating) {
		this.movieRating = movieRating;
	}
	
	
	
	
	
}
