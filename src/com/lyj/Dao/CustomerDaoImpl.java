package com.lyj.Dao;

import com.lyj.Domain.Customer;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;
@Repository(value = "customerDao")
public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {
    @Resource
    public void setSessionFacotry(SessionFactory sessionFacotry) {
        super.setSessionFactory(sessionFacotry);
    }
    @Override
    public List<Customer> selectCustomerList() {
        String sql = "from Customer";
        List<Customer>  list= (List<Customer>) getHibernateTemplate().find(sql);
        return list;
    }

    @Override
    public boolean saveCustomer(Customer customer) {
        try {
            getHibernateTemplate().save(customer);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }

        return false;
    }

    @Override
    public boolean deleteCustomerById(Customer customer) {
        try {
            getHibernateTemplate().delete(customer);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
        return false;
    }
}
