package com.basinger.footballpicks.model;

import java.util.Objects;

public class ContestantResult {

    private String name;
    private int correctPicks;

    public ContestantResult() {}

    public ContestantResult(String name, int correctPicks) {
        this.name = name;
        this.correctPicks = correctPicks;
    }

    // Getters, setters, and other methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCorrectPicks() {
        return correctPicks;
    }

    public void setCorrectPicks(int correctPicks) {
        this.correctPicks = correctPicks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContestantResult)) return false;
        ContestantResult that = (ContestantResult) o;
        return correctPicks == that.correctPicks &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, correctPicks);
    }

    @Override
    public String toString() {
        return "ContestantResult{" +
                "name='" + name + '\'' +
                ", correctPicks=" + correctPicks +
                '}';
    }
}
