package pl.bropinie.dto;

import java.util.Arrays;

public enum Style {
    IPA("india pale ale"),
    PALE_ALE("pale ale"),
    STOUT("stout"),
    PORTER("porter");

    private String name;

    Style(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Style getStyleByName(String styleName) {
        //TODO implement Optional
        Style style = Arrays.stream(Style.values()).filter(s -> s.name.equals(styleName)).findAny().get();
        return style;
    }
}
