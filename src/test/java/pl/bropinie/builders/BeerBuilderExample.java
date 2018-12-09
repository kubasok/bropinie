package pl.bropinie.builders;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import pl.bropinie.dto.Brewery;
import pl.bropinie.dto.Style;
import pl.bropinie.dto.beer.Beer;
import pl.bropinie.dto.beer.builder.BeerBuilderDirector;

public class BeerBuilderExample {

    private final static String PACIFIC = "Pacific";
    private final static String ARTEZAN = "Artezan";
    private final static double ALC = 5.0;
    private final static double GRAVITY = 12.5;
    private final static Integer IBU = 45;

    @Autowired
    BeerBuilderDirector beerBuilderDirector;

    public Beer buildBeer() {

        Set breweries = new HashSet();
        breweries.add(new Brewery(ARTEZAN));

        Beer beer = BeerBuilderDirector.buildBeer(
                PACIFIC,
                Style.IPA,
                breweries,
                ALC,
                GRAVITY,
                IBU
        );

        return beer;
    }
}
