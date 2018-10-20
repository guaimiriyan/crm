package com.lyj.Service;

import com.lyj.Domain.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService{
    @Override
    public List<Customer> SelectCustomerList() {
        return null;
    }
}
