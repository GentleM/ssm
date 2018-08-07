package impl.business;

import dao.business.ArticleDao;
import entity.Article;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * description。
 *
 * @author rango
 *         2018-08-06 22:45
 **/
@Component
public class ArticleDaoImpl implements ArticleDao{

    public List<Article> getArticleList(){
        List<Article> list = new ArrayList<>();
        Article at = new Article();
        at.setTitle("测试");
        list.add(at);
        return list;
    }
}
