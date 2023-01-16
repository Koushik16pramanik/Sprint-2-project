package com.mvs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mvs.entity.Movie;
import com.mvs.service.MovieService;

@RestController
public class MovieController {
	@Autowired
	private MovieService movieservice;

	@PostMapping("/movie")
	public Movie addMovie(@RequestBody Movie movie) {
		return movieservice.saveMovie(movie);
	}

	@GetMapping("/movie")
	public List<Movie> getMovies() {
		return movieservice.getMovies();
	}

	@GetMapping("/movie/{movieName}")
	public Movie getMovieByName(@PathVariable String movieName) {
		return movieservice.getMovieByName(movieName);
	}

	@PutMapping("/movie")
	public Movie updateMovie(@RequestBody Movie movie) {
		return movieservice.updateMovie(movie);
	}

	@DeleteMapping("/movie/{movieName}")
	public String deleteMovie(@PathVariable String movieName) {
		return movieservice.deleteMovie(movieName);
	}
}
