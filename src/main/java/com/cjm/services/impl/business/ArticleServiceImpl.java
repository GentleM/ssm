package com.cjm.services.impl.business;

import com.cjm.entity.Article;
import com.cjm.services.business.ArticleService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 文章Service impl。
 *
 * @author rango
 *         2018-08-07 22:28
 **/
@Component
public class ArticleServiceImpl implements ArticleService{

    public List<Article> getArticleList(){
        List<Article> list = new ArrayList<>();
        Article at = new Article();
        at.setTitle("测试");
        list.add(at);
        return list;
    }
}
