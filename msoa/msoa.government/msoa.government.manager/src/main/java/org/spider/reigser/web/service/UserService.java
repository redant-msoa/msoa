
package org.spider.reigser.web.service;

import org.spider.reigser.web.entity.User;

/**
 * 
 * <p>Title:UserService.java</p>
 * <p>Description:</p>
 * <p>Company:</p>
 * @author HuangMai
 * @Version 1.0
 * 
 */

public interface UserService {

	
	public User login(String uname,String upwd);
}

