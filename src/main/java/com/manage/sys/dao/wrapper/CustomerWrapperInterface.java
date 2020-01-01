package com.manage.sys.dao.wrapper;

import com.manage.sys.entity.po.CustomerPO;

/**
 * Customer表的基本操作
 */
public interface CustomerWrapperInterface {

    /**
     * @param
     * @return
     */
    Boolean addCustomer(CustomerPO customer);

    CustomerPO searchCustomerById(long id);

    Boolean updateCustomer(CustomerPO customerPO);



}
