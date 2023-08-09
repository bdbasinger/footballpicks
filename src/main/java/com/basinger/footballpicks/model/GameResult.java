package com.basinger.footballpicks.model;

import com.basinger.footballpicks.Team;
import jakarta.persistence.*;
import java.util.Objects;

@Entity
public class GameResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gameId;
    private String homeTeam;
    private String awayTeam;
    private String result;

    private Team winner;

    public GameResult() {}

    public GameResult(Long gameId, String homeTeam, String awayTeam, String result, Team winner) {
        this.gameId = gameId;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.result = result;
        this.winner = winner;
    }

    // Getters, setters, and other methods
    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GameResult)) return false;
        GameResult that = (GameResult) o;
        return Objects.equals(gameId, that.gameId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameId);
    }

    @Override
    public String toString() {
        return "GameResult{" +
                "gameId=" + gameId +
                ", homeTeam='" + homeTeam + '\'' +
                ", awayTeam='" + awayTeam + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}
