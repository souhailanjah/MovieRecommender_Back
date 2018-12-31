package com.ps.userportal.services;

import java.util.List;

import com.ps.userportal.entities.Movie;

public interface MovieService {

	Movie create(Movie movie);

	Movie delete(int id);

	List<Movie> findAll();

	Movie findById(int id);

	Movie update(Movie movie);

}
