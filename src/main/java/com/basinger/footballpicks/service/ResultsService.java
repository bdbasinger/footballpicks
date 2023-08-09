package com.basinger.footballpicks.service;

import com.basinger.footballpicks.model.Contestant;
import com.basinger.footballpicks.model.GamePick;
import com.basinger.footballpicks.model.GameResult;
import com.basinger.footballpicks.repository.ContestantRepository;

import com.basinger.footballpicks.repository.GameResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ResultsService {

    private final ContestantRepository contestantRepository;
    private final GameResultRepository gameResultRepository;

    @Autowired
    public ResultsService(ContestantRepository contestantRepository, GameResultRepository gameResultRepository) {
        this.contestantRepository = contestantRepository;
        this.gameResultRepository = gameResultRepository;
    }

    public List<GameResult> getWeeklyResults() {
        List<Contestant> contestants = contestantRepository.findAll();

        // TODO: Load the actual game results. This is just a mockup.
        Map<Long, String> actualGameResults = new HashMap<>();
        actualGameResults.put(1L, "W");
        // ... Add other game results as needed ...

        for (Contestant contestant : contestants) {
            int correctPicksCount = 0;
            List<GamePick> gamePickList = contestant.getGamePicks();

            for (GamePick gamePick : gamePickList) {
                if (actualGameResults.containsKey(gamePick.getGameId()) &&
                        actualGameResults.get(gamePick.getGameId()).equals(gamePick.getPick())) {
                    correctPicksCount++;
                }
            }

            // TODO: Populate the Result object for each contestant.
            // Result result = new Result(contestant.getName(), correctPicksCount);
            // Store or process the result as needed ...
        }

        // Return the weekly results as a list.
        // This is just a mockup, adjust as per your requirements.
        return List.of();  // Replace with the actual results list.
    }
}
