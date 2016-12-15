package com.codehelper.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.codehelper.domain.MyUser;

@Mapper
public interface MyUserDao {

    int insert(@Param("pojo") MyUser pojo);

    int insertList(@Param("pojos") List< MyUser> pojo);

    int update(@Param("pojo") MyUser pojo);

}
