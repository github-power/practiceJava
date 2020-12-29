package test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.UserDao;
import entity.User;

@Controller
public class UserConatroller {
	@Autowired
	UserDao userDao;
	// 所有用户

	@RequestMapping("userAll")
	public String allUser(HttpServletRequest req, HttpServletResponse resp) {
		req.setAttribute("list", userDao.selectAll());
		System.out.println("allUser");
		return "userAll";
	}
 
	// 添加用户
	@RequestMapping("userAdd")
	public String addUser(HttpServletRequest req, HttpServletResponse resp) {

		return "userEdit";
	}

	// 更新用户
	@RequestMapping("userUpdate")
	public String updateUser(int id,HttpServletRequest req, HttpServletResponse resp) {
		req.setAttribute("user", userDao.selectById(id));
		return "userEdit";

	}

	// 删除用户
	@RequestMapping("userDelete")
	public String deleteUser(int id, HttpServletRequest req, HttpServletResponse resp) {
		userDao.delete(id);
		req.setAttribute("list", userDao.selectAll());
		return "userAll";

	}

	@RequestMapping("saveUser")
	public void saveUser(User user, HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("insertUser");
		userDao.insert(user);
		System.out.println("alluser");

	}

}
