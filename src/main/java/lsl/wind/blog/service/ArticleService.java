package lsl.wind.blog.service;

import lsl.wind.blog.domain.Article;

/**
 * @Author lsl
 * @Date 2020/11/2 17:05
 */
public interface ArticleService {
    Article getOneArticle(Long id);
}
