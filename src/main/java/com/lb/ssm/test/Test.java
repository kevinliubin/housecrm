package com.lb.ssm.test;

import java.util.Random;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Assert;

import com.lb.ssm.common.IDUtils;

public class Test {

	public static void main(String[] args) {
		int a = (int)IDUtils.genItemId();
		
		long b = IDUtils.genItemId();
		System.out.println(a);
		System.out.println(b);
		
		Random random = new Random();
		int end2 = random.nextInt(99);
		String string = String.format("%02d", end2);
		System.out.println(string);
		
		long millis = System.currentTimeMillis();
		//截取后9位
		String string2 = (millis+"").substring(4, 13);
		System.out.println(string2);
		
		System.out.println(IDUtils.setUserId());
	}
	
	@org.junit.Test
	public void testHelloworld() {  
		 //1、获取SecurityManager工厂，此处使用Ini配置文件初始化SecurityManager  
	    Factory<org.apache.shiro.mgt.SecurityManager> factory =  
	            new IniSecurityManagerFactory("classpath:shiro3.ini");  
	    //2、得到SecurityManager实例 并绑定给SecurityUtils  
	    org.apache.shiro.mgt.SecurityManager securityManager = factory.getInstance();  
	    SecurityUtils.setSecurityManager(securityManager);  
	    //3、得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证）  
	    Subject subject = SecurityUtils.getSubject();  
	    UsernamePasswordToken token = new UsernamePasswordToken("zhang", "123");  
	    
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
	    //6、退出  
	    subject.logout();  
	}
	@org.junit.Test
	public void testhasRole(){
		Subject subject = ShiroUtil.login("classpath:shiro4.ini", "zhang", 123+"");
		System.out.println(subject.hasRole("role2")?"有角色":"没角色");
	}
	
}
