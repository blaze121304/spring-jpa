package com.rusty.project.movie.persistence;

import com.rusty.project.movie.domain.Screening;

public interface ScreeningDAO {
    Screening selectScreening(Long screeningId);

    void insert(Screening screening);
}
