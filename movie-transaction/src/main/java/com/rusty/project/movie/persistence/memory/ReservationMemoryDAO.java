package com.rusty.project.movie.persistence.memory;

import com.rusty.project.movie.domain.Reservation;
import com.rusty.project.movie.persistence.ReservationDAO;
import org.springframework.stereotype.Repository;

@Repository
public class ReservationMemoryDAO extends InMemoryDAO<Reservation> implements ReservationDAO {
    @Override
    public void insert(Reservation reservation) {
        super.insert(reservation);
    }
}
