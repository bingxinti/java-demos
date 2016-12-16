package news;

/**
 * Created by Demon on 16/12/11.
 */
public class NewsTest {

    public static void main(String[] args) {
        test();
    }

//    ibatis CURD 测试
    public  static void  test()
    {
        System.out.println("test-begin");
        NewsHandler.getCountNewsModel();
        NewsHandler.getNewsDetail();
        NewsHandler.getAllNewsModel();
        NewsHandler.addNewsModel();
        NewsHandler.updateNewsModel();
        System.out.println("test-end");
    }
}
