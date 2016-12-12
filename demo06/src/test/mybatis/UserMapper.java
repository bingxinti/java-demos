package test.mybatis;

public interface UserMapper {
	public void insertUser(User user);

	public User getUser(String name);


	public User updateUser(User user);

}
