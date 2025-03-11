package com.rusty.project.movie.persistence;

import com.rusty.project.movie.domain.Reservation;

public interface ReservationDAO {
    void insert(Reservation reservation);
}
