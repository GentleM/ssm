package com.cjm.services.business;

import com.cjm.entity.Article;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 文章处理Service。
 *
 * @author rango
 *         2018-08-07 22:21
 **/
public interface ArticleService {

    List<Article> getArticleList();
}
