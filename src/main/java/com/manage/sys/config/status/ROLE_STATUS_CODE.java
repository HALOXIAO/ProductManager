package com.manage.sys.config.status;

public enum  ROLE_STATUS_CODE {

    ROLE_STATUS_CODE_ABUNDANT(0),
    ROLE_STATUS_CODE_USE(1),
    ROLE_STATUS_CODE_PEND(2),
    ROLE_STATUS_CODE_PERMISSION_MANAGER(0),
    ROLE_STATUS_CODE_PERMISSION_SALESMAN(1),
    ROLE_STATUS_CODE_PERMISSION_

    private final int value;

    ROLE_STATUS_CODE(final int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }

}
