package lsl.wind.blog.service.impl;

import lsl.wind.blog.dao.ArticleDao;
import lsl.wind.blog.domain.Article;
import lsl.wind.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author lsl
 * @Date 2020/11/2 10:37
 */
@Service
@Transactional
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleDao articleDao;

    @Override
    public Article getOneArticle(Long id){
        return articleDao.getArticleById(id);
    }
}
