package uk.co.curlybrackets.pokemondb.service;

import uk.co.curlybrackets.pokemondb.domain.Caught;

import java.util.List;

public interface CaughtService {

    List<Caught> listAll();
    Caught getById(Long id);
    void createNew(Long pokemonId, String date, String location);
    void deleteById(Long id);
}
