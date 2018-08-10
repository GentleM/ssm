package com.cjm.controller.news;

import com.cjm.entity.Article;
import com.cjm.services.business.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 新闻Controller。
 *
 * @author rango
 * 2018-08-05 11:24
 **/
@RestController
@RequestMapping("/Article")
public class NewsController {

    @Autowired
    ArticleService articleService;

    /**
     * 获取新闻列表。
     *
     * @return
     */
    @RequestMapping("/get")
    public void getArticleList() {
        List<Article> list = articleService.getArticleList();
        return;
    }
}
