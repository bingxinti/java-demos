package news;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import test.mybatis.MyBatisUtil;

import java.util.List;


/**
 * Created by Demon on 16/12/11.
 */
public class NewsHandler {

    static SqlSessionFactory sqlSessionFactory = null;
    static {
        sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
    }


    public static void test()
    {
        System.out.println("test ");
    }


    public static void   getCountNewsModel()
    {
        int count =  sqlSessionFactory.openSession().getMapper(NewsMapper.class).getCountNewsModel();
        System.out.println("getCountNewsModel "+count);
    }


    public static void getNewsDetail() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            NewsMapper newsMapper = sqlSession.getMapper(NewsMapper.class);
            NewsModel newsModel = newsMapper.getNewsModel("test");
            System.out.println("getNewsDetail "+newsModel.getId());

        } finally {
            sqlSession.close();
        }
    }

    public static void getAllNewsModel()
    {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        NewsMapper newsMapper = sqlSession.getMapper(NewsMapper.class);
        List<NewsModel> newsModelList  = newsMapper.getAllNewsModel();
        System.out.println( "getAllNewsModel "+ newsModelList.size() );
    }

    public static void addNewsModel()
    {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        NewsMapper newsMapper = sqlSession.getMapper(NewsMapper.class);
        NewsModel newsModel = new NewsModel();
        newsModel.setTitle("title");
        newsModel.setContent("content");
        newsModel.setSort(12);
        int addID = newsMapper.addNewsModel(newsModel);
        System.out.println("addNewsModel "+addID);

        sqlSession.commit();
    }



    public static void updateNewsModel()
    {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        NewsMapper newsMapper = sqlSession.getMapper(NewsMapper.class);
        NewsModel newsModel = new NewsModel();
        newsModel.setTitle("title44");
        newsModel.setContent("content44");
        newsModel.setSort(13);
        newsModel.setId(4);
        newsMapper.updateNewsModel(newsModel);
        System.out.println("updateNewsModel");

        sqlSession.commit();
    }

    public  int delNewsModel(int id)
    {
        int delID =  sqlSessionFactory.openSession().getMapper(NewsMapper.class).delNewsModel(id);
        return delID;
    }



}

