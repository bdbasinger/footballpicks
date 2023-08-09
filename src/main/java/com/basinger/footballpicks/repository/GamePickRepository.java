package com.basinger.footballpicks.repository;

import com.basinger.footballpicks.model.GamePick;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GamePickRepository extends JpaRepository<GamePick, Long> {

}
