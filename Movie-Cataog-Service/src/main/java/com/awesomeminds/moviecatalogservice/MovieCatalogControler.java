package com.awesomeminds.moviecatalogservice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.awesomeminds.moviecatalogservice.modal.CatalogItem;
import com.awesomeminds.moviecatalogservice.modal.Movie;
import com.awesomeminds.moviecatalogservice.modal.Rating;
import com.awesomeminds.moviecatalogservice.modal.UserRating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogControler {

	@Autowired
	private RestTemplate restTemplate;

	private WebClient.Builder webClientBuilder;

	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalogItems(@PathVariable("userId") String userId) {

		UserRating userRatings = restTemplate.getForObject("http://localhost:8083/rating/users/" + userId, UserRating.class);

		return userRatings.getRatings().stream().map(rating -> {

			Movie movie = restTemplate.getForObject("http://localhost:8082/movies/" + rating.getMovieId(), Movie.class);

			/*
			 * Movie movie = webClientBuilder.build() .get()
			 * .uri("http://localhost:8082/movies/" + rating.getMovieId()).retrieve()
			 * .bodyToMono(Movie.class).block();
			 */
			return new CatalogItem(movie.getName(), "its kannada movie", rating.getRating());
		}).collect(Collectors.toList());

		/*
		 * return Collections.singletonList(new CatalogItem("kgf",
		 * "its kannada movie",4));
		 */
	}

}