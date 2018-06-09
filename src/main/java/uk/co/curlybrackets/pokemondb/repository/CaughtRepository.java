package uk.co.curlybrackets.pokemondb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uk.co.curlybrackets.pokemondb.domain.Caught;

public interface CaughtRepository extends JpaRepository<Caught, Long> {

}
