package lsl.wind.blog.dao;

import lsl.wind.blog.domain.Article;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author lsl
 * @Date 2020/11/2 16:21
 */
@Repository
public interface ArticleDao {

    Article getArticleById(Long id);
}
