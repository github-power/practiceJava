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
	// �����û�

	@RequestMapping("userAll")
	public String allUser(HttpServletRequest req, HttpServletResponse resp) {
		req.setAttribute("list", userDao.selectAll());
		System.out.println("allUser");
		return "userAll";
	}
 
	// ����û�
	@RequestMapping("userAdd")
	public String addUser(HttpServletRequest req, HttpServletResponse resp) {

		return "userEdit";
	}

	// �����û�
	@RequestMapping("userUpdate")
	public String updateUser(int id,HttpServletRequest req, HttpServletResponse resp) {
		req.setAttribute("user", userDao.selectById(id));
		return "userEdit";

	}

	// ɾ���û�
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
