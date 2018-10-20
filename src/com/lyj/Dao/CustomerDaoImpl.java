package com.lyj.Dao;

import com.lyj.Domain.Customer;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

    @Override
    public List<Customer> selectCustomerList() {
        return null;
    }
}
