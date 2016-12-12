package news;

/**
 * Created by Demon on 16/12/11.
 */
public class NewsModel {

    private  Integer id;
    private  Integer sort;
    private  String title;
    private  String content;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public NewsModel(Integer id, Integer sort,String title,String content)
    {
        super();
        this.id = id;
        this.sort = sort;
        this.title = title;
        this.content = content;
    }

    public NewsModel() {
        super();
    }


}
