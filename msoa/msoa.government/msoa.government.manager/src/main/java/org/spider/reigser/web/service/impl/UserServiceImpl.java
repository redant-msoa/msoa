
package org.spider.reigser.web.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.spider.reigser.web.entity.User;
import org.spider.reigser.web.mapper.UserMapper;
import org.spider.reigser.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * <p>Title:UserServiceImpl.java</p>
 * <p>Description:</p>
 * <p>Company:</p>
 * @author HuangMai
 * @Version 1.0
 * 
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	public User login(String uname, String upwd) {
		Map<String,Object> params =new HashMap<String,Object>();
		params.put("uname", uname);
		params.put("upwd", upwd);
		return userMapper.findUser(params);
	}

}

