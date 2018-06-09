package uk.co.curlybrackets.pokemondb.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class PokemonCaught {

    @Id
    @Column
    private Long pokemon_id;
    @Column
    private String date;
    @Column
    private String location;

    public PokemonCaught() {

    }

    public PokemonCaught(Long pokemon_id, String date, String location) {
        this.pokemon_id = pokemon_id;
        this.date = date;
        this.location = location;
    }
}
