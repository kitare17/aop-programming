package com.aop_programming.demo.entity;

import org.springframework.stereotype.Repository;

@Repository
public class Movie {
    public String getMovieDetails(){
        return "Movie details";
    }
}
