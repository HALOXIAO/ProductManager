package com.manage.sys.dao.wrapper;

import com.manage.sys.entity.PO.CustomerPO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

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
