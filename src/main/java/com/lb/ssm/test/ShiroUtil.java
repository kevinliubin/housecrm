package com.lb.ssm.test;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Assert;

public class ShiroUtil {
	
	public static Subject login(String ini,String uname,String password){
		  Factory<org.apache.shiro.mgt.SecurityManager> factory =  
		            new IniSecurityManagerFactory(ini);  
		    //2、得到SecurityManager实例 并绑定给SecurityUtils  
		    org.apache.shiro.mgt.SecurityManager securityManager = factory.getInstance();  
		    SecurityUtils.setSecurityManager(securityManager);  
		    //3、得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证）  
		    Subject subject = SecurityUtils.getSubject();  
		    UsernamePasswordToken token = new UsernamePasswordToken(uname, password);  
		    try {  
		        //4、登录，即身份验证  
		        subject.login(token);  
		        System.out.println("登录成功");
		    } catch (AuthenticationException e) {  
		        //5、身份验证失败  
		    	e.printStackTrace();
		    	System.out.println("登录失败");
		    }  
		  
		    Assert.assertEquals(true, subject.isAuthenticated()); //断言用户已经登录  
		  /*  //6、退出  
		    subject.logout();  */
		return subject;
	}
	
}
