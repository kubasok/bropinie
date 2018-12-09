package pl.bropinie.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import pl.bropinie.dto.beer.Beer;

public interface BeerDao extends CrudRepository<Beer, Long> {

    List<Beer> findById(long id);
}
