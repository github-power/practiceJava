package test;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dao.UserDao;
import entity.User;

@RestController
public class test_Controller{
	@Autowired
	UserDao userDao;
	
	  @RequestMapping("testUserAll")
	  public List<User> AA(HttpServletResponse resp){
		  
		  resp.setContentType("text/html;charset=utf-8"); 
		  
		  return userDao.selectAll();
//		  return "12121212";
//		  
	  }
	  
	  @RequestMapping("aa")
	  public String AA( ){
		  return "12121212";
	  }
//	  @RequestMapping("viewIndex")
//	  public String returnView(HttpServletRequest req) {
//		  req.setAttribute("list", userDao.selectAll());
//		  return "index";
//
//	
//	}
}