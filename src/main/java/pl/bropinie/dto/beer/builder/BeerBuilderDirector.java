package pl.bropinie.dto.beer.builder;

import java.util.Set;

import org.springframework.stereotype.Service;
import pl.bropinie.dto.Brewery;
import pl.bropinie.dto.Style;
import pl.bropinie.dto.beer.Beer;

@Service
public final class BeerBuilderDirector {

    private static BeerBuilder beerBuilder;

    private BeerBuilderDirector(BeerBuilder beerBuilder) {
        this.beerBuilder = beerBuilder;
    }

    public static Beer buildBeer(String name,
                          Style style,
                          Set<Brewery> breweries,
                          double alcohol,
                          double gravity,
                          Integer ibu
    ) {
        return beerBuilder.reset()
                .withName(name)
                .withStyle(style)
                .withBreweries(breweries)
                .withAlcohol(alcohol)
                .withGravity(gravity)
                .withIbu(ibu)
                .getBeer();
    }
}