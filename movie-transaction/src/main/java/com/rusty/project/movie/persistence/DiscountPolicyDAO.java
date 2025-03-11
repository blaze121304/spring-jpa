package com.rusty.project.movie.persistence;

import com.rusty.project.movie.domain.DiscountPolicy;

public interface DiscountPolicyDAO {
    DiscountPolicy selectDiscountPolicy(Long movieId);

    void insert(DiscountPolicy discountPolicy);
}
