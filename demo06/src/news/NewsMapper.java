package news;

import java.util.List;

/**
 * Created by Demon on 16/12/11.
 */
public interface NewsMapper {

    public  NewsModel getNewsModel(String title);

    public List<NewsModel> getAllNewsModel();

    public  int getCountNewsModel();

    public  int addNewsModel(NewsModel newsModel);

    public  void updateNewsModel(NewsModel newsModel);

    public  int delNewsModel(int id);
}
