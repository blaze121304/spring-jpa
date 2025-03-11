package com.rusty.project.movie.persistence.memory;

import com.rusty.project.movie.domain.DiscountPolicy;
import com.rusty.project.movie.persistence.DiscountPolicyDAO;
import org.springframework.stereotype.Repository;

@Repository
public class DiscountPolicyMemoryDAO extends InMemoryDAO<DiscountPolicy> implements DiscountPolicyDAO {
    @Override
    public DiscountPolicy selectDiscountPolicy(Long movieId) {
        return findOne(policy -> policy.getMovieId().equals(movieId));
    }
}
