package com.basinger.footballpicks.model;


import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table
public class Contestant {

    @Id
    @SequenceGenerator(
            name = "contestant_sequence",
            sequenceName = "contestant_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "contestant_sequence"
    )
    private Long id;
    private String name;
    private String email;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "contestant")
    private List<GamePick> gamePicks;

    public List<GamePick> getGamePicks() {
        return gamePicks;
    }

    public void setGamePicks(List<GamePick> gamePicks) {
        this.gamePicks = gamePicks;
    }

    public Contestant() {}

    public Contestant(Long id, String name, String email, List<GamePick> gamePicks) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gamePicks = gamePicks;
    }

    public Contestant(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters, setters, and other methods
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contestant)) return false;
        Contestant that = (Contestant) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Contestant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gamePicks=" + gamePicks +
                '}';
    }
}


/*
package com.basinger.footballpicks.model;


import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Contestant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ElementCollection
    @CollectionTable(name = "game_picks", joinColumns = @JoinColumn(name = "contestant_id"))
    @MapKeyColumn(name = "game_id")
    @Column(name = "pick")
    private Map<Long, String> gamePicks;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contestant contestant)) return false;
        return Objects.equals(id, contestant.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}*/
