package com.rusty.project.movie.persistence.memory;

import com.rusty.project.movie.domain.Screening;
import com.rusty.project.movie.persistence.ScreeningDAO;
import org.springframework.stereotype.Repository;

@Repository
public class ScreeningMemoryDAO extends InMemoryDAO<Screening> implements ScreeningDAO {
    @Override
    public Screening selectScreening(Long id) {
        return findOne(screening -> screening.getId().equals(id));
    }
}
