package pl.bropinie.dto.beer.builder;

import java.util.Set;

import org.springframework.stereotype.Service;
import pl.bropinie.dto.Brewery;
import pl.bropinie.dto.Style;
import pl.bropinie.dto.beer.Beer;

@Service
public class BeerBuilderImpl implements BeerBuilder {

    private Beer beer;

    @Override
    public BeerBuilder reset() {
        beer = new Beer();
        return this;
    }

    @Override
    public BeerBuilder withName(String name) {
        beer.setName(name);
        return this;
    }

    @Override
    public BeerBuilder withBreweries(Set<Brewery> breweries) {
        beer.setBreweries(breweries);
        return this;
    }

    @Override
    public BeerBuilder withStyle(Style style) {
        beer.setStyle(style);
        return this;
    }

    @Override
    public BeerBuilder withAlcohol(double alcohol) {
        beer.setAlcohol(alcohol);
        return this;
    }

    @Override
    public BeerBuilder withGravity(double gravity) {
        beer.setGravity(gravity);
        return this;
    }

    @Override
    public BeerBuilder withIbu(Integer ibu) {
        beer.setIbu(ibu);
        return this;
    }

    @Override
    public Beer getBeer() {
        return beer;
    }
}