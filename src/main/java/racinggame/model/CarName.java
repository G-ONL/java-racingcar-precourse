package racinggame.model;

import racinggame.utils.ValidationUtils;

public class CarName {
    public CarName(String name) {
        ValidationUtils.validNullAndEmpty(name);
        ValidationUtils.validNameLength(name);
    }
    
}
