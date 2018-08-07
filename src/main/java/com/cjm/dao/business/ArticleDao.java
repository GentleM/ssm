package com.cjm.dao.business;

import com.cjm.entity.Article;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 文章Dao。
 *
 * @author rango
 *         2018-08-06 22:40
 **/
@Service
public interface ArticleDao {

    List<Article> getArticleList();
}
