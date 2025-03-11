package com.rusty.project.movie.persistence.memory;

import com.rusty.project.movie.domain.Movie;
import com.rusty.project.movie.persistence.MovieDAO;
import org.springframework.stereotype.Repository;

@Repository
public class MovieMemoryDAO extends InMemoryDAO<Movie> implements MovieDAO {
    @Override
    public Movie selectMovie(Long movieId) {
        return findOne(movie -> movie.getId().equals(movieId));
    }
}
