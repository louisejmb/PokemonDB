package uk.co.curlybrackets.pokemondb.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uk.co.curlybrackets.pokemondb.domain.Caught;
import uk.co.curlybrackets.pokemondb.service.CaughtService;

import java.util.List;


@RestController
public class CaughtController {

    @Autowired
    CaughtService caughtService;

    @RequestMapping(value = "/caught", method = RequestMethod.GET)
    public List<Caught> getCaught() {
        return caughtService.listAll();
    }

    @RequestMapping(value = "/caught/{id}", method = RequestMethod.GET)
    public Caught getCaughtById(@PathVariable Long id) {
        return caughtService.getById(id);
    }

    @RequestMapping(value = "/caught", method = RequestMethod.POST)
    public void addCaught(
            @RequestParam(value = "pokemon_id") Long pokemonId,
            @RequestParam(value = "date") String date,
            @RequestParam(value = "location") String location) {
        caughtService.createNew(pokemonId, date, location);
    }

    @RequestMapping(value = "/caught", method = RequestMethod.PUT)
    public void overwriteCaught(
            @RequestParam(value = "pokemon_id") Long pokemonId,
            @RequestParam(value = "date") String date,
            @RequestParam(value = "location") String location) {

    }

    @RequestMapping(value = "/caught", method = RequestMethod.PATCH)
    public void updateCaught(
            @RequestParam(value = "pokemon_id") Long pokemonId,
            @RequestParam(value = "date") String date,
            @RequestParam(value = "location") String location) {

    }

    @RequestMapping(value = "/caught/{id}", method = RequestMethod.DELETE)
    public void deleteCaught(@PathVariable Long id) {
            caughtService.deleteById(id);

    }

}
