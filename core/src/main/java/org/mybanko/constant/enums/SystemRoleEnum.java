package org.mybanko.constant.enums;

import org.mybanko.exception.NoSuchEnumElementException;

public enum SystemRoleEnum {
    ROOT(1000),
    USER_ADMIN(2000),
    ACCOUNT_ADMIN(3000),
    COMMON_USER(888);

    private final int ROLE_NUMBER;

    SystemRoleEnum(int roleNumber) {
        this.ROLE_NUMBER = roleNumber;
    }

    public static SystemRoleEnum getSystemRole(int roleNumber) {
        switch (roleNumber) {
            case 1000:
                return ROOT;
            case 2000:
                return USER_ADMIN;
            case 3000:
                return ACCOUNT_ADMIN;
            case 888:
                return COMMON_USER;
            default:
                throw new NoSuchEnumElementException("SystemRoleEnum", roleNumber);
        }
    }
}
