package com.wang.ssm.mapper;
import com.wang.ssm.po.User;

/**
 * 用户数据访问DAO层接口
 */
public interface UserMapper {

	/**
	 * 插入用户信息
	 * @return 插入的用户条数
	 */
	Integer insertUser(User user);


}