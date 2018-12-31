package com.ps.userportal.repositories;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.ps.userportal.entities.Movie;;

public interface MovieRepository extends Repository<Movie, Integer> {


	Movie save(Movie movie);

	void delete(Movie movie);

	List<Movie> findAll();

	Movie findOne(int id);

}
