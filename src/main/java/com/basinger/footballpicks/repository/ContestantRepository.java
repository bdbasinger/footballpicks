package com.basinger.footballpicks.repository;


import com.basinger.footballpicks.model.Contestant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContestantRepository extends JpaRepository<Contestant, Long> {
    // Additional query methods can be added here if needed
}
