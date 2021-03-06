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

@Controller
public class testMVC {
	@Autowired
	UserDao userDao;

	@RequestMapping("viewIndex")
	public String returnView(HttpServletRequest req) {
		req.setAttribute("list", userDao.selectAll());
		return "index";
	}
}