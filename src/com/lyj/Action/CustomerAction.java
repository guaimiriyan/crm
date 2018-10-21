package com.lyj.Action;

import com.lyj.Domain.Customer;
import com.lyj.Service.CustomerService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
@Component(value = "customerAction")
@Scope(value = "prototype")
public class CustomerAction extends ActionSupport implements ModelDriven<Customer>{
    @Resource(name = "customerService")
    private CustomerService customerService;
    private ActionContext context;
    private Customer customer = new Customer();
    public String list(){
        List<Customer> list = customerService.SelectCustomerList();
        System.out.println(list);
        context = ActionContext.getContext();
        ValueStack valueStack = context.getValueStack();
        valueStack.set("customerList",list);
        return "list";
    }
    public String save(){
        boolean flag = customerService.saveCustomer(customer);
        if (flag) return SUCCESS;
        else return ERROR;
    }
    public String delete(){
        boolean b = customerService.deleteCustomerById(customer);
        if (b) return SUCCESS;
        else  return ERROR;
    }
    @Override
    public Customer getModel() {
        return customer;
    }

}
