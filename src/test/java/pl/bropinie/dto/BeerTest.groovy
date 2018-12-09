package pl.bropinie.dto

import pl.bropinie.dto.beer.Beer
import spock.lang.Specification

class BeerTest extends Specification {

    private final static String PACIFIC = 'Pacific'
    private final static String ARTEZAN = 'Artezan'
    private final static double ALC = 5.0
    private final static double GRAVITY = 12.5
    private final static int IBU = 45

    def 'should create a beer'() {
        given:
        Set breweries = [new Brewery(ARTEZAN)]

        when:
        Beer beer = new Beer(PACIFIC, breweries)
        beer.setAlcohol(ALC)
        beer.setGravity(GRAVITY)
        beer.setIbu(IBU)

        then:
        beer.name.equals(PACIFIC)
        beer.breweries.size() == 1
        beer.alcohol == ALC
        beer.gravity == GRAVITY
        beer.ibu == IBU
    }
}
