package com.manage.sys.Manager.Utils;

import java.sql.Date;

public class Convert {

    public static Date stringConvertToTimestamp(String str)throws IllegalArgumentException{
        return Date.valueOf(str);
    }
}
