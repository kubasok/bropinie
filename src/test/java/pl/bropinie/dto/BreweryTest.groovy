package pl.bropinie.dto

class BreweryTest extends spock.lang.Specification {

    private final static String ARTEZAN = 'Artezan'

    def 'should create a brewery'() {
        when:
        Brewery brewery = new Brewery(ARTEZAN)

        then:
        brewery.name.equals(ARTEZAN)
    }

}
