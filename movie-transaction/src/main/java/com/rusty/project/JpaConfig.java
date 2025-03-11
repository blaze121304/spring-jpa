package com.rusty.project;

import com.rusty.project.movie.domain.DiscountCondition;
import com.rusty.project.movie.domain.DiscountPolicy;
import com.rusty.project.movie.domain.Movie;
import com.rusty.project.movie.domain.Screening;
import com.rusty.project.movie.persistence.DiscountConditionDAO;
import com.rusty.project.movie.persistence.DiscountPolicyDAO;
import com.rusty.project.movie.persistence.MovieDAO;
import com.rusty.project.movie.persistence.ScreeningDAO;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Configuration
public class JpaConfig {
    @Bean
    public ApplicationRunner initializer(MovieDAO movieDAO,
                                         DiscountPolicyDAO discountPolicyDAO,
                                         DiscountConditionDAO discountConditionDAO,
                                         ScreeningDAO screeningDAO) {
        return args -> {
            Movie movie = new Movie(1L, "한산", 120, 10000L);
            movieDAO.insert(movie);

            Screening screening = new Screening(movie.getId(), 1,
                    LocalDateTime.of(2024, 12, 11, 18, 0));
            screeningDAO.insert(screening);

            DiscountPolicy discountPolicy = new DiscountPolicy(movie.getId(),
                    DiscountPolicy.PolicyType.AMOUNT_POLICY, 1000L, null);
            discountPolicyDAO.insert(discountPolicy);

            discountConditionDAO.insert(new DiscountCondition(discountPolicy.getId(),
                    DiscountCondition.ConditionType.SEQUENCE_CONDITION, null, null, null, 1));
            discountConditionDAO.insert(new DiscountCondition(discountPolicy.getId(),
                    DiscountCondition.ConditionType.PERIOD_CONDITION, DayOfWeek.WEDNESDAY,
                    LocalTime.of(9, 0), LocalTime.of(11, 30), null));
        };
    }
}
