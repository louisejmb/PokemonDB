package uk.co.curlybrackets.pokemondb.service;

import uk.co.curlybrackets.pokemondb.domain.Pokemon;

import java.util.List;

public interface PokemonService {

    List<Pokemon> listAll();
    Pokemon getById(Long id);
    void createNew(String name, String type);
    void deleteById(Long id);
}
