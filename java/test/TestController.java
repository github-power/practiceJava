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

//@RestController   //restful Controller
@Controller
public class  TestController{
	
	 @Autowired
	 UserDao dao;
	
	  @RequestMapping("index")
	  public String index1(HttpServletRequest req,HttpServletResponse resp){
		  req.setAttribute("list",dao.selectAll());
		  return "index";
	  }
	
      @RequestMapping("add")
	  public String index(HttpServletRequest req,HttpServletResponse resp){
		 req.setAttribute("sexs",User.sexs);
    	  return "edit";
      }
			  
	  @RequestMapping("edit")
	  public String edit(int id,HttpServletRequest req,HttpServletResponse resp){
		  req.setAttribute("lnfo",dao.selectById(id));
		  return add(req, resp);
	  }
		  
	  private String add(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping("save")
	  public String save(User u,HttpServletRequest req,HttpServletResponse resp){
		  dao.insert(u);
		  return index1(req,resp);  
	  }
		
	  @RequestMapping("update")
	  public String update(User u,HttpServletRequest req,HttpServletResponse resp){
		  dao.update(u);
		  return index1(req,resp);	
	  }
			  
	  @RequestMapping("delete")
	  public String delete(int id,HttpServletRequest req,HttpServletResponse resp){
		  dao.delete(id);
		  return index1(req,resp);	
		   
	  }
}
