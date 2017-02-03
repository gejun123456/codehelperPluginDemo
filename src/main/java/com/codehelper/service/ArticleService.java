package com.codehelper.service;

import com.codehelper.domain.Article;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

import com.codehelper.mapper.ArticleDao;

@Service
public class ArticleService{

    @Resource
    private ArticleDao articleDao;

    public int insert(Article pojo){
        return articleDao.insert(pojo);
    }

    public int insertList(List<Article> pojos){
        return articleDao.insertList(pojos);
    }

    public int update(Article pojo){
        return articleDao.update(pojo);
    }

}
