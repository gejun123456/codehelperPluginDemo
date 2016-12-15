package com.codehelper.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import com.codehelper.domain.MyUser;

public interface MyUserDao {

    int insert(@Param("pojo") MyUser pojo);

    int insertList(@Param("pojos") List< MyUser> pojo);

    int update(@Param("pojo") MyUser pojo);


    List<MyUser> findByIdLikeAndSerialIdIn(@Param("likeId")Integer likeId,@Param("serialIdList")List<Long> serialIdList);

    int updateUserNameById(@Param("updatedUserName")String updateduserName,@Param("id")Integer id);


    int deleteById(@Param("id")Integer id);

    int countByIdBetween(@Param("minId")Integer minId,@Param("maxId")Integer maxId);

    List<String> findDistinctUserNameByIdBetween(@Param("minId")Integer minId,@Param("maxId")Integer maxId);

    int updateUserNameAndPasswordByIdBetween(@Param("updatedUserName")String updateduserName,@Param("updatedPassword")String updatedpassword,@Param("minId")Integer minId,@Param("maxId")Integer maxId);

    int deleteByUserNameAndAddTime(@Param("userName")String userName,@Param("addTime")Date addTime);

    List<MyUser> findUserNameAndPasswordByIdGreaterThan(@Param("minId")Integer minId);


    int countDistinctUserNameByAgeLessThan(@Param("maxAge")Integer maxAge);


}
