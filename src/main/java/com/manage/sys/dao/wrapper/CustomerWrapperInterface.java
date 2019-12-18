package com.manage.sys.dao.wrapper;

import com.manage.sys.entity.PO.CustomerPO;

/**
* Customer表的基本操作
* */
public interface CustomerWrapperInterface {

    /**
     * @param
     * @return
     * */
    public Boolean addCustomer(CustomerPO customer);

    public CustomerPO searchCustomerById(long id);


}
