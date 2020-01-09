package com.manage.sys.config.status;

import java.util.ArrayList;
import java.util.List;

public enum SEARCH_STATUS_CODE {

    PRODUCT_ID(1),
    PRODUCT_NUMBER(2),
    PRODUCT_NAME(3);


    private final int value;

    SEARCH_STATUS_CODE(final int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

}
