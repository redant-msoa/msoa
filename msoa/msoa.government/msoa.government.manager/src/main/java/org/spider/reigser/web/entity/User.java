
package org.spider.reigser.web.entity;

/**
 * 
 * <p>Title:User.java</p>
 * <p>Description:用户实体类</p>
 * <p>Company:</p>
 * @author HuangMai
 * @Version 1.0
 * 
 */

public class User {
	private Integer uid;    //用户id;
	private String uname;    //用户姓名
	private String upwd;    //用户密码
	private String ustatus;  //用户状态
	
	
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getUstatus() {
		return ustatus;
	}
	public void setUstatus(String ustatus) {
		this.ustatus = ustatus;
	}
	
	
	
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", upwd=" + upwd
				+ ", ustatus=" + ustatus + "]";
	}
	
	
	public User(Integer uid, String uname, String upwd, String ustatus) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upwd = upwd;
		this.ustatus = ustatus;
	}
	
	
	public User() {
		super();
	}
	
	
	
	
}

