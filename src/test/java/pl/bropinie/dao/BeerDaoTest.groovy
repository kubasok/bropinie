package pl.bropinie.dao

import org.springframework.beans.factory.annotation.Autowired
import pl.bropinie.builders.BeerBuilderExample
import pl.bropinie.dto.beer.Beer
import spock.lang.Specification

class BeerDaoTest extends Specification {

    @Autowired
    BeerDao beerDao = Mock()
    BeerBuilderExample beerBuilderExample = new BeerBuilderExample()

    def "should write beer to database"() {
        given:
        Beer beer = beerBuilderExample.buildBeer()

        when:
        beerDao.save(beerBuilderExample)

        then:
        beerDao.findAll().size() == 1

//        cleanup:
        beerDao.delete(beer)
    }
}
