package com.lyj.Service;

import com.lyj.Dao.CustomerDao;
import com.lyj.Domain.Customer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service(value = "customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService{
    @Resource(name = "customerDao")
    private CustomerDao customerDao;
    @Override
    public List<Customer> SelectCustomerList() {
        return customerDao.selectCustomerList();
    }

    @Override
    public boolean saveCustomer(Customer customer) {
        return customerDao.saveCustomer(customer);
    }

    @Override
    public boolean deleteCustomerById(Customer customer) {
        return customerDao.deleteCustomerById(customer);
    }
}
