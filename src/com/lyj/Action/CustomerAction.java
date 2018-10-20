package com.lyj.Action;

import com.lyj.Domain.Customer;
import com.lyj.Service.CustomerService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
@Component(value = "customerAction")
@Scope(value = "prototype")
public class CustomerAction extends ActionSupport {
    @Resource(name = "customerService")
    private CustomerService customerService;
    public String list(){
        List<Customer> list = customerService.SelectCustomerList();
        ActionContext context = ActionContext.getContext();
        ValueStack valueStack = context.getValueStack();
        valueStack.set("customerList",list);
        return SUCCESS;
    }
}
