package uk.co.curlybrackets.pokemondb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uk.co.curlybrackets.pokemondb.domain.PokemonCaught;

public interface PokemonCaughtRepository extends JpaRepository<PokemonCaught, Long> {

}
