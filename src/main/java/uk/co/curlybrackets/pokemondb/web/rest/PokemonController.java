package uk.co.curlybrackets.pokemondb.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uk.co.curlybrackets.pokemondb.domain.Pokemon;
import uk.co.curlybrackets.pokemondb.service.PokemonService;

import java.util.List;


@RestController
public class PokemonController {

    @Autowired
    PokemonService pokemonService;

    @RequestMapping(value = "/pokemon", method = RequestMethod.GET)
    public List<Pokemon> getPokemon() {
        return pokemonService.listAll();
    }

    @RequestMapping(value = "/pokemon/{id}", method = RequestMethod.GET)
    public Pokemon getPokemonById(@PathVariable Long id) {
        return pokemonService.getById(id);
    }

    @RequestMapping(value = "/pokemon", method = RequestMethod.POST)
    public void addPokemon(
            @RequestParam(value = "name") String name,
            @RequestParam(value = "type") String type) {
        pokemonService.createNew(name, type);
    }

    @RequestMapping(value = "/pokemon", method = RequestMethod.PUT)
    public void overwritePokemon(
            @RequestParam(value = "name") String name,
            @RequestParam(value = "type") String type) {

    }

    @RequestMapping(value = "/pokemon", method = RequestMethod.PATCH)
    public void updatePokemon(
            @RequestParam(value = "name") String name,
            @RequestParam(value = "type") String type) {

    }

    @RequestMapping(value = "/pokemon/{id}", method = RequestMethod.DELETE)
    public void deletePokemon(@PathVariable Long id) {
            pokemonService.deleteById(id);

    }

}
