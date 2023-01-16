package com.mvs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mvs.entity.Movie;

public interface MovieRepo extends JpaRepository<Movie,String> {

}
