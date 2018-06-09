package uk.co.curlybrackets.pokemondb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uk.co.curlybrackets.pokemondb.domain.Pokemon;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long> {

}
