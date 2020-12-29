package entity;

public class User {
	
	public Integer id;
	public String name;
	public Integer sex;
	public static String [] sexs = {"未指定","男性","女性"};

	public static String[] getSexs() {
		return sexs;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", sex=" + sex + "]";
	}

}
