package com.mvs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mvs.entity.Movie;

public interface MovieService{
	public Movie saveMovie(Movie movie);
	public List<Movie> getMovies();
	public Movie getMovieByName(String movieName);
	public Movie updateMovie(Movie movie);
	public String deleteMovie(String movieName);
}
