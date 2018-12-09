package pl.bropinie.dto.beer;

import java.util.stream.Collectors;

import pl.bropinie.dto.Brewery;

public class BeerDescriptor {

    private static final String FROM = " from ";
    private static final String WITH = " with ";
    private static final String ALCOHOL = " alcohol, ";
    private static final String GRAVITY = " gravity, ";
    private static final String IBU = " IBU";

    public static String describe(Beer beer) {
        StringBuffer stringBuffer = new StringBuffer();

        String breweriesNames = beer.getBreweries()
                .stream()
                .map(Brewery::getName)
                .collect(Collectors.joining(", "));

        return stringBuffer
                .append(beer.getName())
                .append(" ")
                .append(beer.getStyle())
                .append(FROM)
                .append(breweriesNames)
                .append(WITH)
                .append(beer.getAlcohol())
                .append(ALCOHOL)
                .append(beer.getGravity())
                .append(GRAVITY)
                .append(beer.getIbu())
                .append(IBU)
                .append(".")
                .toString();
    }
}
