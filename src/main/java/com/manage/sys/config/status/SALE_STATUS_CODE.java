package com.manage.sys.config.status;

public enum SALE_STATUS_CODE {
    SALE_STATUS_CODE_ORDERTOGENERATE(0),
    SALE_STATUS_CODE_DELIVERED(1),
    SALE_STATUS_CODE_FULLPAY(2);

    private final int value;

    SALE_STATUS_CODE(final int newValue){value=newValue;}

    public int getValue() {
        return value;
    }

}
