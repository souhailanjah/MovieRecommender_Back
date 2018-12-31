package com.ps.userportal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ps.userportal.entities.Movie;
import com.ps.userportal.services.MovieService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/movies"})
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping
    public Movie create(@RequestBody Movie movie){
        return movieService.create(movie);
    }

    @GetMapping(path = {"/{id}"})
    public Movie findOne(@PathVariable("id") int id){
        return movieService.findById(id);
    }

    @PutMapping(path = {"/{id}"})
    public Movie update(@PathVariable("id") int id, @RequestBody Movie movie){
        movie.setId(id);
        return movieService.update(movie);
    }

    @DeleteMapping(path ={"/{id}"})
    public Movie delete(@PathVariable("id") int id) {
        return movieService.delete(id);
    }

    @GetMapping
    public List<Movie> findAll(){
        return movieService.findAll();
    }
}
