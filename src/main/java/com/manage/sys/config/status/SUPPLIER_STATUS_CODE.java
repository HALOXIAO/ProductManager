package com.manage.sys.config.status;

public enum SUPPLIER_STATUS_CODE {
    SUPPLIER_STATUS_CODE_FORMERSUPPLIER(0),
    SUPPLIER_STATUS_CODE_CURRENTSUPPLIER(1),
    SUPPLIER_STATUS_CODE_CONTINOUSSUPPLIER(2);
    private final int value;

    SUPPLIER_STATUS_CODE(final int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
}
