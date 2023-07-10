package org.mybanko.constant.enums;

import org.mybanko.exception.NoSuchEnumElementException;

public enum IdentifyDocumentTypeEnum {
    PASSPORT(1),
    SPAIN_DNI(2),
    SPAIN_NIE(3),
    CHINA_ID_NUMBER(4),
    ROMANIA_ID_NUMBER(5);

    private final int TYPE_NUMBER;

    IdentifyDocumentTypeEnum(int typeNumber) {
        this.TYPE_NUMBER = typeNumber;
    }

    public static IdentifyDocumentTypeEnum getIdentifyDocumentType(int typeNumber) {
        switch (typeNumber) {
            case 1:
                return PASSPORT;
            case 2:
                return SPAIN_DNI;
            case 3:
                return SPAIN_NIE;
            case 4:
                return CHINA_ID_NUMBER;
            case 5:
                return ROMANIA_ID_NUMBER;
            default:
                throw new NoSuchEnumElementException("IdentifyDocumentTypeEnum", typeNumber);
        }
    }
}