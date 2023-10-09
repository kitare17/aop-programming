package com.aop_programming.demo.service;


import com.aop_programming.demo.entity.Movie;
import com.aop_programming.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilteringTechnique1 {

    @Autowired
    private Movie movie;

    public  String contentBasedFiltering() {
        String movieDetails = movie.getMovieDetails();
        return movieDetails;
    }
    public int testBeforeAnnotation(){
        return 1;
    }
}
