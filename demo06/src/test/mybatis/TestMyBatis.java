package test.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class TestMyBatis {
	static SqlSessionFactory sqlSessionFactory = null;
	static {
		sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
	}

	public static void main(String[] args) {
		testAdd();
		getUser();
	}

	public static void testAdd() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			User user = new User( );
			user.setAge(new Integer(25));
			user.setName("ll");
			userMapper.insertUser(user);
			sqlSession.commit();// 这里一定要提交，不然数据进不去数据库中
		} finally {
			sqlSession.close();
		}
	}

//
//
//	public static void testUpdate() {
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//		try {
//			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//			User user = new User("lisi", new Integer(25));
//			userMapper.insertUser(user);
//			sqlSession.commit();// 这里一定要提交，不然数据进不去数据库中
//		} finally {
//			sqlSession.close();
//		}
//	}


	public static void getUser() {;
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			User user = userMapper.getUser("bb");

			System.out.println("name: " + user.getName() + "|age: "
					+ user.getAge());

		} finally {
			System.out.println("close");
			sqlSession.close();
		}
	}
}
