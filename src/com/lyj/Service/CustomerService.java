package com.lyj.Service;

import com.lyj.Domain.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> SelectCustomerList();
    public boolean saveCustomer(Customer customer);
    public boolean deleteCustomerById(Customer customer);
}
