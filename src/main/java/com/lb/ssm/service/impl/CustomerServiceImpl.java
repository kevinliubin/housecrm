package com.lb.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.lb.ssm.common.IDUtils;
import com.lb.ssm.mapper.CustomerMapper;
import com.lb.ssm.service.CustomerService;
import com.lb.ssm.vo.Customer;
import com.lb.ssm.vo.CustomerExample;
import com.lb.ssm.vo.CustomerExample.Criteria;
/**
 * 顾客service
 * @author liubin
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService {
	
	//注入mapper
	@Autowired
	private CustomerMapper customerMapper;
	
	
	@Override
	public List<Customer> getCustomerList(String limit, String offset) {
		//实例化查询条件
		CustomerExample example = new CustomerExample();
		int pageindex=0;
		if(Integer.parseInt(offset) !=0){
			pageindex = Integer.parseInt(offset)/Integer.parseInt(limit);
		}
		pageindex+= 1;
		//分页处理
		PageHelper.startPage(pageindex, Integer.parseInt(limit));
		List<Customer> list = customerMapper.selectByExample(example);
		return list;
	}


	@Override
	public void addCustomer(Customer customer) {
		//补全信息
		customer.setCustomerid(IDUtils.setUserId());
		customer.setCustomercardname(customer.getCustomername());
		customerMapper.insertSelective(customer);
	}


	@Override
	public Customer getCustomerById(Integer id) {
		return customerMapper.selectByPrimaryKey(id);
	}


	@Override
	public void updateCustomer(Customer customer) {
		customerMapper.updateByPrimaryKeySelective(customer);
	}


	@Override
	public List<Customer> customerpageRefush(String name, String limit, String offset) {
		//实例化查询条件
		CustomerExample example = new CustomerExample();
		int pageindex=0;
		if(Integer.parseInt(offset) !=0){
			pageindex = Integer.parseInt(offset)/Integer.parseInt(limit);
		}
		pageindex+= 1;
		//分页处理
		PageHelper.startPage(pageindex, Integer.parseInt(limit));
		Criteria criteria = example.createCriteria();
		criteria.andCustomernameLike(name);
		List<Customer> list = customerMapper.selectByExample(example);
		return list;
	}

}
