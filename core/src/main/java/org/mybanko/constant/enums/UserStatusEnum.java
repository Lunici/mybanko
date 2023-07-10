package org.mybanko.constant.enums;

import org.mybanko.exception.NoSuchEnumElementException;

public enum UserStatusEnum {
    NEW_OPEN(1),
    ACTIVE(2),
    BLOCKED(3);

    private final int STATUS_NUMBER;

    UserStatusEnum(int statusNumber) {
        this.STATUS_NUMBER = statusNumber;
    }

    public static UserStatusEnum getUserStatus(int statusNumber) {
        switch (statusNumber) {
            case 1:
                return NEW_OPEN;
            case 2:
                return ACTIVE;
            case 3:
                return BLOCKED;
            default:
                throw new NoSuchEnumElementException("UserStatusEnum", statusNumber);
        }
    }

}
