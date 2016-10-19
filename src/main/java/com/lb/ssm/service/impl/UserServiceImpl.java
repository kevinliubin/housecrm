package com.lb.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.lb.ssm.common.DateUtil;
import com.lb.ssm.common.IDUtils;
import com.lb.ssm.common.MD5Util;
import com.lb.ssm.mapper.UserMapper;
import com.lb.ssm.service.UserService;
import com.lb.ssm.vo.User;
import com.lb.ssm.vo.UserExample;
import com.lb.ssm.vo.UserExample.Criteria;

@Service
public class UserServiceImpl implements UserService{
	
	
	@Autowired
	private UserMapper useMapper;
	
	@Override
	public User getUser(User user) {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		//不是离职状态
		criteria.andUserstateNotEqualTo(1);
		criteria.andUsernameEqualTo(user.getUsername());
		criteria.andUserpasswordEqualTo(user.getUserpassword());
		List<User> list = useMapper.selectByExample(example);
		if (list != null && list.size() >0 ) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public List<User> getUserList(String limit, String offset) {
		//实例化查询条件
		UserExample example = new UserExample();
		int pageindex=0;
		if(Integer.parseInt(offset) !=0){
			pageindex = Integer.parseInt(offset)/Integer.parseInt(limit);
		}
		pageindex+= 1;
		//分页处理
		PageHelper.startPage(pageindex, Integer.parseInt(limit));
		//执行查询
		Criteria criteria = example.createCriteria();
		criteria.andUserstateEqualTo(0);
		List<User> list = useMapper.selectByExample(example);
		return list;
	}

	@Override
	public int countUser() {
		//实例化查询条件
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserstateEqualTo(0);
		int count = useMapper.countByExample(example);
		return count;
	}

	@Override
	public User getUserById(Integer id) {
		return useMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateUser(User user) {
		useMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public int deleteUser(Integer userId) {
		//根据Id查出user的信息
		User user = useMapper.selectByPrimaryKey(userId);
		user.setUserstate(2);
		int i = useMapper.updateByPrimaryKeySelective(user);
		return i;
	}

	@Override
	public void addUser(User user) {
		//补全user信息
		user.setUserid((int)IDUtils.setUserId());
		//加密码加密
		user.setUserpassword(MD5Util.MD5(user.getUserpassword()));
		user.setUserstate(0);
		user.setUserindate(DateUtil.getSystemDate2());
		
		useMapper.insertSelective(user);
		
	}

	@Override
	public List<User> getSearchUserList(String name, String limit, String offset) {
		//实例化查询条件
		UserExample example = new UserExample();
		int pageindex=0;
		if(Integer.parseInt(offset) !=0){
			pageindex = Integer.parseInt(offset)/Integer.parseInt(limit);
		}
		pageindex+= 1;
		//分页处理
		PageHelper.startPage(pageindex, Integer.parseInt(limit));
		//执行查询
		Criteria criteria = example.createCriteria();
		criteria.andUserstateEqualTo(0);
		criteria.andUsercardnameLike(name);
		List<User> list = useMapper.selectByExample(example);
		return list;
	}
	
	
	
}
