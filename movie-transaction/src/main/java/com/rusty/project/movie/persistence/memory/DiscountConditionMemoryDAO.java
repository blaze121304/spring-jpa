package com.rusty.project.movie.persistence.memory;

import com.rusty.project.movie.domain.DiscountCondition;
import com.rusty.project.movie.persistence.DiscountConditionDAO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DiscountConditionMemoryDAO extends InMemoryDAO<DiscountCondition> implements DiscountConditionDAO {
    @Override
    public List<DiscountCondition> selectDiscountConditions(Long policyId) {
        return findMany(condition -> condition.getPolicyId().equals(policyId));
    }
}
