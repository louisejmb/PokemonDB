package uk.co.curlybrackets.pokemondb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.co.curlybrackets.pokemondb.domain.Pokemon;
import uk.co.curlybrackets.pokemondb.repository.PokemonRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PokemonServiceImpl implements PokemonService {

    @Autowired
    private PokemonRepository pokemonRepository;

    @Override
    public List<Pokemon> listAll() {
        return pokemonRepository.findAll();
    };

    @Override
    public Pokemon getById(Long id) {
        Optional<Pokemon> o = pokemonRepository.findById(id);
        return o.get();
    }

    public void createNew(String name, String type) {
        pokemonRepository.save(new Pokemon(name, type));
    }

    public void deleteById(Long id) {
        pokemonRepository.deleteById(id);
    }
}
