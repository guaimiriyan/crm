package com.lyj.Dao;

import com.lyj.Domain.Customer;

import java.util.List;

public interface CustomerDao {
    public List<Customer> selectCustomerList();
}
