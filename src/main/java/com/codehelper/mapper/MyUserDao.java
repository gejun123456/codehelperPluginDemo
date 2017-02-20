package com.codehelper.mapper;

import com.codehelper.domain.MyUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MyUserDao {
    int insert(@Param("pojo") MyUser pojo);

    int insertSelective(@Param("pojo") MyUser pojo);

    int insertList(@Param("pojos") List<MyUser> pojo);

    int update(@Param("pojo") MyUser pojo);

    int delete();

    MyUser findById(@Param("id")Integer id);

    List<MyUser> find();

    int updateUserNameById(@Param("updatedUserName")String updatedUserName,@Param("id")Integer id);

    Integer findAgeById(@Param("id")Integer id);

    List<MyUser> findByUserName(@Param("userName")String userName);

    Integer countByIdBetween(@Param("minId")Integer minId,@Param("maxId")Integer maxId);


    List<MyUser> findByIdGreaterThanOrEqualTo(@Param("minId")Integer minId);

    List<MyUser> findByIdLessThanOrEqualTo(@Param("maxId")Integer maxId);


    List<MyUser> findByIdBetweenOrEqualTo(@Param("minId")Integer minId,@Param("maxId")Integer maxId);

    List<MyUser> findByIdBetween(@Param("minId")Integer minId,@Param("maxId")Integer maxId);

    Integer count();
}
