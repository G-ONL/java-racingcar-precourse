package racinggame.model;

import racinggame.utils.ValidationUtils;

public class CarName {
    private final String name;

    public CarName(String name) {
        ValidationUtils.validNullAndEmpty(name);
        ValidationUtils.validNameLength(name);
        this.name = name;
    }

    public String getValue() {
        return this.name;
    }
}
