
package org.spider.reigser.web.mapper;

import java.util.Map;

import org.spider.reigser.web.entity.User;

/**
 * 
 * <p>Title:UserMapper.java</p>
 * <p>Description:</p>
 * <p>Company:</p>
 * @author HuangMai
 * @Version 1.0
 * 
 */

public interface UserMapper {

	/**
	 * 用户登录
	 * @param uname
	 * @param upwd
	 * @return
	 */
	public User findUser(Map<String,Object> params);
}

