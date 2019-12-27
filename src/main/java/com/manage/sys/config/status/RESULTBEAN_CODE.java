package com.manage.sys.config.status;

public enum RESULTBEAN_CODE {
    NO_LOGIN(-1),
    SUCCESS(0),
    CHECK_FAIL(1),
    NO_PERMISSION(2),
    ARGUMENT_ERROR(3),
    UNKNOWN_EXCEPTION(-99);
    final int value;

    RESULTBEAN_CODE(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
