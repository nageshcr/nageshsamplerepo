package com.awesomeminds.movieinfoservice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.awesomeminds.movieinfoservice.modal.Movie;

@RestController
@RequestMapping("/movies")
public class MovieInfoController {
	
	@RequestMapping("/{movieId}")
	public Movie getMovie(@PathVariable String movieId) {
		
		return new Movie(movieId,"kgf");
	}
	
	

}
