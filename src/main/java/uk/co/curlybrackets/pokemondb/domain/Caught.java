package uk.co.curlybrackets.pokemondb.domain;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;

@Entity
@Table
@JsonSerialize
public class Caught {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;
    @Column
    private Long pokemonId;
    @Column
    private String date;
    @Column
    private String location;

    public Caught() {

    }

    public Caught(Long pokemonId, String date, String location) {
        this.pokemonId = pokemonId;
        this.date = date;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPokemonId() {
        return pokemonId;
    }

    public void setPokemonId(Long pokemonId) {
        this.pokemonId = pokemonId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Caught{" +
                "id=" + id +
                ", pokemonId=" + pokemonId +
                ", date='" + date + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
