package pl.bropinie.dto.beer.builder

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.context.annotation.Bean
import pl.bropinie.dto.Brewery
import pl.bropinie.dto.Style
import pl.bropinie.dto.beer.Beer
import pl.bropinie.dto.beer.BeerDescriptor
import spock.lang.Specification

@SpringBootTest
class BeerBuilderTest extends Specification {

    private final static String PACIFIC = 'Pacific'
    private final static String ARTEZAN = 'Artezan'
    private final static double ALC = 5.0
    private final static double GRAVITY = 12.5
    private final static Integer IBU = 45

    BeerBuilderDirector beerBuilderDirector = new BeerBuilderDirector(new BeerBuilderImpl())

    def "should build IPA"() {
        given:
        Set breweries = [new Brewery(ARTEZAN)]

        when:
        Beer beer = BeerBuilderDirector.buildBeer(
                PACIFIC,
                Style.IPA,
                breweries,
                ALC,
                GRAVITY,
                IBU
        )

        then:
        BeerDescriptor.describe(beer).equals("Pacific IPA from Artezan with 5.0 alcohol, 12.5 gravity, 45 IBU.")

    }
}
