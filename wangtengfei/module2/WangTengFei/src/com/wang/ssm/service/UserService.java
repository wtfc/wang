package com.wang.ssm.service;

import com.wang.ssm.po.User;

/**
 * 用户Service层接口
 */
public interface UserService {

	/**
	 * 插入用户操作
	 * @return 插入的用户条数
	 * */
	Integer insertUser(User user) throws Exception;
}
