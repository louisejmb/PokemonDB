package uk.co.curlybrackets.pokemondb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.co.curlybrackets.pokemondb.domain.Caught;
import uk.co.curlybrackets.pokemondb.repository.CaughtRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CaughtServiceImpl implements CaughtService {

    @Autowired
    private CaughtRepository caughtRepository;

    @Override
    public List<Caught> listAll() {
        return caughtRepository.findAll();
    }

    @Override
    public Caught getById(Long id) {
        Optional<Caught> o = caughtRepository.findById(id);
        return o.get();
    }

    public void createNew(Long pokemonId, String date, String location) {
        caughtRepository.save(new Caught(pokemonId, date, location));
    }

    public void deleteById(Long id) {
        caughtRepository.deleteById(id);
    }
}
