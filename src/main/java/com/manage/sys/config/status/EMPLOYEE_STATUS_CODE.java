package com.manage.sys.config.status;


public enum EMPLOYEE_STATUS_CODE {
    EMPLOYEE_STATUS_CODE_QUIT(0),
    EMPLOYEE_STATUS_CODE_WORKING(1),
    EMPLOYEE_STATUS_CODE_OFF(2),
    EMPLOYEE_STATUS_CODE_SEX_MAN(0),
    EMPLOYEE_STATUS_CODE_SEX_WOMAN(1),
    EMPLOYEE_STATUS_CODE_SEX_OTHER(2);
    private final int value;

    EMPLOYEE_STATUS_CODE(final int newValue) {
        value = newValue;
    }

    public int getValue() {
        return value;
    }
    }
