package com.codehelper.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.codehelper.domain.Article;


@Mapper
public interface ArticleDao {

    int insert(@Param("pojo") Article pojo);

    int insertList(@Param("pojos") List< Article> pojo);

    int update(@Param("pojo") Article pojo);

}
