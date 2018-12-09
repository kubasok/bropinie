package pl.bropinie.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.bropinie.dao.BeerDao;
import pl.bropinie.dto.Style;
import pl.bropinie.dto.beer.Beer;
import pl.bropinie.dto.beer.builder.BeerBuilderDirector;

@RestController
public class CreateBeerController {

    private BeerDao beerDao;

    public CreateBeerController(BeerDao beerDao) {
        this.beerDao = beerDao;
    }

    @PostMapping(value = "/create")
    public Beer createBeer(
            @RequestParam String name,
            @RequestParam String style
    ) {
        Beer beer = BeerBuilderDirector.buildBeer(name, Style.valueOf(style), null, 0, 0, null);
        beerDao.save(beer);
        return beer;
    }

}
