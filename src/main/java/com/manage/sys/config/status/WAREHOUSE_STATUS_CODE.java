package com.manage.sys.config.status;

public enum WAREHOUSE_STATUS_CODE {
    WAREHOUSE_STATUS_CODE_PLAN(0),
    WAREHOUSE_STATUS_CODE_USE(1),
    WAREHOUSE_STATUS_CODE_QUIT(2);
    private final int value;

    WAREHOUSE_STATUS_CODE(final int newValue){value=newValue;}

    public int getValue(){return value;}
}
