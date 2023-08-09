package com.basinger.footballpicks.repository;

import com.basinger.footballpicks.model.GameResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameResultRepository extends JpaRepository<GameResult, Long> {
    // Additional query methods can be added here if needed
}

