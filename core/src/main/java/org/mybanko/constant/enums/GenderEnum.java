package org.mybanko.constant.enums;

import org.mybanko.exception.NoSuchEnumElementException;

public enum GenderEnum {
    UNDEFINED(0),
    MALE(1),
    FEMALE(2),
    WALMART_BAG(100);

    private final int GENDER_NUMBER;

    GenderEnum(int genderNumber) {
        this.GENDER_NUMBER = genderNumber;
    }

    public static GenderEnum getGender(int genderNumber) {
        switch (genderNumber) {
            case 0:
                return UNDEFINED;
            case 1:
                return MALE;
            case 2:
                return FEMALE;
            case 100:
                return WALMART_BAG;
            default:
                throw new NoSuchEnumElementException("GenderEnum", genderNumber);
        }
    }
}
