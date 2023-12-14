package com.cquptnews.service;

import com.cquptnews.pojo.Article;
import com.cquptnews.pojo.PageBean;

public interface ArticleService {
    //新增文章
    void add(Article article);

    //条件分页列表查询
    PageBean<Article> list(Integer pageNum, Integer pageSize, Integer categoryId, String state);
}
