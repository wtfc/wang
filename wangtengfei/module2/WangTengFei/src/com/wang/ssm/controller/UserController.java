package com.wang.ssm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wang.ssm.po.User;
import com.wang.ssm.service.UserService;
/**
 * 用户管理Controller
 * */
@Controller
public class UserController {

	@Autowired
	private UserService userService;

	/**
	 * 插入用户操作
	 * @return 修改条数
	 * */
	@RequestMapping("insertUser")
	public ModelAndView insertUser(Model model,HttpServletRequest request, HttpServletResponse response,
			String userName,String userSex,String userAge,String userAddrss) throws Exception {

		User user = new User();												//用户
		ModelAndView modelAndView = new ModelAndView();	//返回操作结果用
		int insertCount = 0;														//插入数据条数

		//要插入的用户的信息
		user.setUserName(userName);
		user.setUserSex(userAge);
		user.setUserAge(userAge);
		user.setUserAddrss(userAddrss);

		insertCount = userService.insertUser(user);						//插入用户操作

		if (insertCount == 0) {														//插入失败
			modelAndView.setViewName("insert_failed");					//view设置

		}else{																				//插入成功
			modelAndView.addObject("insertCount", insertCount);	//插入条数返回
			modelAndView.setViewName("insert_success");				//view设置
		}

		return modelAndView;
	}

}
