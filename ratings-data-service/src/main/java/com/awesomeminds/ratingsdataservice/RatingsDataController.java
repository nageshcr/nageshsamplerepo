package com.awesomeminds.ratingsdataservice;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.awesomeminds.ratingsdataservice.modal.Rating;
import com.awesomeminds.ratingsdataservice.modal.UserRating;

@RestController
@RequestMapping("rating")
public class RatingsDataController {

	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {

		return new Rating(movieId, 4);
	}
	
	@RequestMapping("/users/{userId}")
	public UserRating getUserRatings(@PathVariable("userId")String userId){
		
		List<Rating> ratings = Arrays.asList(

				new Rating("1234", 4), 
				new Rating("5678", 3));
		UserRating userRating = new UserRating();
		userRating.setRatings(ratings);
		return userRating;
	}

}
