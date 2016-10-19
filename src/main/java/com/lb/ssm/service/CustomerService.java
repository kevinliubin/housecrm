package com.lb.ssm.service;

import java.util.List;

import com.lb.ssm.vo.Customer;

public interface CustomerService {
	
	List<Customer> getCustomerList(String limit,String offset);
	
	void addCustomer(Customer customer);
	
	Customer getCustomerById(Integer id);
	
	void updateCustomer(Customer customer);

	List<Customer> customerpageRefush(String name, String limit, String offset);
	
}
