package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import entity.User;

@Repository
public interface UserDao {
	@Select("select * from user")
	public List<User> selectAll();

	// todo
	@Insert("insert into user (name,sex) values (#{name},#{sex})")
	public void insert(User user);

	@Delete("delete from user where id = #{id}")
	public void delete(int id);

	@Update("update user set name = #{name}, sex = #{sex} where id = #{id}")
	public void update(User user);

	@Select("select * from user where name  = #{name}")
	public void selectByName(User user);

	@Select("select * from user where id = #{id}")
	public User selectById(int id);
}