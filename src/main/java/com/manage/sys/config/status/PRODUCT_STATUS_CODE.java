package com.manage.sys.config.status;

public enum PRODUCT_STATUS_CODE {
    PRODUCT_STATUS_CODE_LAYOUT(0),
    PRODUCT_STATUS_CODE_SALEING(1),
    PRODUCT_STATUS_CODE_STOCKOUT(2);

    private final int value;

    PRODUCT_STATUS_CODE(final int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }

}
