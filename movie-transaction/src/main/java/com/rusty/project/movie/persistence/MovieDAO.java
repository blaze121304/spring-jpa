package com.rusty.project.movie.persistence;


import com.rusty.project.movie.domain.Movie;

public interface MovieDAO {
    Movie selectMovie(Long movieId);

    void insert(Movie movie);
}
