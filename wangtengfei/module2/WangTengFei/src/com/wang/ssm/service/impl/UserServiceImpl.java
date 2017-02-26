package com.wang.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.wang.ssm.mapper.UserMapper;
import com.wang.ssm.po.User;
import com.wang.ssm.service.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	/**
	 * 插入用户操作
	 * @return 插入的用户条数
	 * */
	@Override
	public Integer insertUser(User user)  throws Exception{
		return userMapper.insertUser(user);	//插入用户,并返回插入条数
	}

}
