package lsl.wind.blog.controller;

import lsl.wind.blog.domain.Article;
import lsl.wind.blog.service.impl.ArticleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lsl
 * @Date 2020/11/2 10:50
 */
@RestController
public class ArticleController {

    @Autowired
    ArticleServiceImpl articleService;

    @GetMapping("/article/{id}")
    public Article queryArticleById(@PathVariable("id") Long id){
        return articleService.getOneArticle(id);
    }

}
