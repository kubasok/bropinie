package pl.bropinie.dto.beer;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import pl.bropinie.dto.Brewery;
import pl.bropinie.dto.Style;

@Entity
public class Beer {

    @Id
    @GeneratedValue()
    private long id;

    @Column
    @NotNull
    private String name;
    @Enumerated(EnumType.STRING)
    @Column
    @NotNull
    private Style style;
    @ManyToMany
    private Set<Brewery> breweries;
    @Column
    private double alcohol;
    @Column
    private double gravity;
    @Column
    private Integer ibu;

    public Beer() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Brewery> getBreweries() {
        return breweries;
    }

    public void setBreweries(Set<Brewery> breweries) {
        this.breweries = breweries;
    }

    public double getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(double alcohol) {
        this.alcohol = alcohol;
    }

    public double getGravity() {
        return gravity;
    }

    public void setGravity(double gravity) {
        this.gravity = gravity;
    }

    public Integer getIbu() {
        return ibu;
    }

    public void setIbu(Integer ibu) {
        this.ibu = ibu;
    }

}