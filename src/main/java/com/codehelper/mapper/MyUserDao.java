package com.codehelper.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.codehelper.domain.MyUser;

@Mapper
public interface MyUserDao {

    int insert(@Param("pojo") MyUser pojo);

    int insertList(@Param("pojos") List<MyUser> pojo);

    int update(@Param("pojo") MyUser pojo);


    List<MyUser> findByIdLikeAndSerialIdIn(@Param("likeId") Integer likeId, @Param("serialIdList") List<Long> serialIdList);

    int updateUserNameById(@Param("updatedUserName")String updatedUserName,@Param("id")Integer id);


    int deleteById(@Param("id") Integer id);

    List<String> findDistinctUserNameByIdBetween(@Param("minId") Integer minId, @Param("maxId") Integer maxId);

    int updateUserNameAndPasswordByIdBetween(@Param("updatedUserName")String updatedUserName,@Param("updatedPassword")String updatedPassword,@Param("minId")Integer minId,@Param("maxId")Integer maxId);

    int deleteByUserNameAndAddTime(@Param("userName") String userName, @Param("addTime") Date addTime);

    List<MyUser> findUserNameAndPasswordByIdGreaterThan(@Param("minId") Integer minId);


    Integer countDistinctUserNameByAgeLessThan(@Param("maxAge")Integer maxAge);


    List<MyUser> findByUserName(@Param("userName") String userName);

    List<MyUser> findByIdInAndUserNameIn(@Param("idList")List<Integer> idList,@Param("userNameList")List<String> userNameList);


    MyUser findFirstByUserName(@Param("userName") String userName);


    List<MyUser> findUserNameAndPasswordByIdBetween(@Param("minId") Integer minId, @Param("maxId") Integer maxId);


    List<MyUser> findByIdGreaterThan(@Param("minId") Integer minId);

    List<MyUser> findByIdLessThan(@Param("maxId") Integer maxId);

    List<String> findDistinctUserNameByIdIn(@Param("idList") List<Integer> idList);


    List<MyUser> findByAgeGreaterThanAndIdLessThan(@Param("minAge") Integer minAge, @Param("maxId") Integer maxId);


    List<MyUser> findByAgeOrderByUserNameDesc(@Param("age") Integer age);


    Integer countByIdBetween(@Param("minId")Integer minId,@Param("maxId")Integer maxId);


    int deleteByIdBetween(@Param("minId")Integer minId,@Param("maxId")Integer maxId);


    List<MyUser> findByRemainingAmountGreaterThan(@Param("minRemainingAmount")BigDecimal minRemainingAmount);


    MyUser findFirstByIdGreaterThan(@Param("minId")Integer minId);

    List<MyUser> findFirst100ByIdGreaterThan(@Param("minId")Integer minId);
}
