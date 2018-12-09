package pl.bropinie.dto.beer.builder;

import java.util.Set;

import org.springframework.stereotype.Service;
import pl.bropinie.dto.Brewery;
import pl.bropinie.dto.Style;
import pl.bropinie.dto.beer.Beer;

@Service
public interface BeerBuilder {
    BeerBuilder reset();
    BeerBuilder withName(String name);
    BeerBuilder withBreweries(Set<Brewery> breweries);
    BeerBuilder withStyle(Style style);
    BeerBuilder withAlcohol(double alcohol);
    BeerBuilder withGravity(double gravity);
    BeerBuilder withIbu(Integer ibu);
    Beer getBeer();
}
