package com.manage.sys.config.status;

public enum CUSTOMER_STATUS_CODE {
    CUSTOMER_STATUS_CODE_ORDINARY(0),
    CUSTOMER_STATUS_CODE_VIP_I(1),
    CUSTOMER_STATUS_CODE_VIP_II(2),

    CUSTOMER_STATUS_CODE_CUSTOMER_TYPE_PERSON(0),
    CUSTOMER_STATUS_CODE_CUSTOMER_TYPE_COMPANY(1),
    CUSTOMER_STATUS_CODE_CUSTOMER_TYPE_GOVERNMENT(2);
    private final int value;

    CUSTOMER_STATUS_CODE(final int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
}
