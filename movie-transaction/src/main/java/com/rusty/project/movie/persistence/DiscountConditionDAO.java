package com.rusty.project.movie.persistence;

import com.rusty.project.movie.domain.DiscountCondition;

import java.util.List;

public interface DiscountConditionDAO {
    List<DiscountCondition> selectDiscountConditions(Long policyId);

    void insert(DiscountCondition discountCondition);
}
