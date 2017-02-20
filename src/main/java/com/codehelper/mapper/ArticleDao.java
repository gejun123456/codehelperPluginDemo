package com.codehelper.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.codehelper.domain.Article;


@Mapper
public interface ArticleDao {

    int nima(@Param("pojo") Article pojo);

    int insertList(@Param("pojos") List< Article> pojo);

    int updateHehe(@Param("pojo") Article pojo);

}
