package uk.co.curlybrackets.pokemondb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import uk.co.curlybrackets.pokemondb.domain.Pokemon;
import uk.co.curlybrackets.pokemondb.repository.PokemonRepository;

@SpringBootApplication
@EnableJpaRepositories
public class PokemondbApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(PokemondbApplication.class);

    @Autowired
    PokemonRepository pokemonRepository;

    public static void main(String[] args) {
		SpringApplication.run(PokemondbApplication.class, args);
	}

	public void run (String... strings) throws Exception {

        pokemonRepository.save(new Pokemon("Bulbasaur", "Grass"));
        pokemonRepository.save(new Pokemon("Charmander", "Fire"));
        pokemonRepository.save(new Pokemon("Squirtle", "Water"));
    }
}
