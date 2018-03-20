package com.codehelper.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.codehelper.domain.MyUser;

@Mapper
public interface MyUserDao {
    int insert(@Param("pojo") MyUser pojo);

    int insertSelective(@Param("pojo") MyUser pojo);

    int insertList(@Param("pojos") List<MyUser> pojo);

    int update(@Param("pojo") MyUser pojo);

    int delete();
            List<MyUser> find();
    MyUser findById(@Param("id")Integer id);
            Integer findAgeById(@Param("id")Integer id);
    List<MyUser> findByUserName(@Param("userName")String userName);
            Integer countByIdBetween(@Param("minId")Integer minId,@Param("maxId")Integer maxId);
    List<MyUser> findByIdGreaterThanOrEqualTo(@Param("minId")Integer minId);
            List<MyUser> findByIdLessThanOrEqualTo(@Param("maxId")Integer maxId);
    List<MyUser> findByIdBetweenOrEqualTo(@Param("minId")Integer minId,@Param("maxId")Integer maxId);
            Integer count();
    List<String> findDistinctUserName();
            List<String> findDistinctUserNameOrderByGlobalIdDesc();
    int deleteById(@Param("id")Integer id);
            int deleteByIdBetween(@Param("minId")Integer minId,@Param("maxId")Integer maxId);
    Integer countDistinctUserNameByAgeLessThan(@Param("maxAge")Integer maxAge);
            MyUser findFirstByUserName(@Param("userName")String userName);
    List<MyUser> findUserNameAndPasswordByIdBetween(@Param("minId")Integer minId,@Param("maxId")Integer maxId);
            List<MyUser> findByIdGreaterThan(@Param("minId")Integer minId);
    List<MyUser> findByIdLessThan(@Param("maxId")Integer maxId);
            List<MyUser> findByIdBetween(@Param("minId")Integer minId,@Param("maxId")Integer maxId);
    List<String> findDistinctUserNameByIdIn(@Param("idList")List<Integer> idList);
            List<MyUser> findByAgeGreaterThanAndIdLessThan(@Param("minAge")Integer minAge,@Param("maxId")Integer maxId);
    List<MyUser> findByAgeOrderByUserNameDesc(@Param("age")Integer age);
            List<MyUser> findByIdInAndUserNameIn(@Param("idList")List<Integer> idList,@Param("userNameList")List<String> userNameList);
    int updateUserNameById(@Param("updatedUserName")String updatedUserName,@Param("id")Integer id);
            int updateUserNameAndPasswordByIdBetween(@Param("updatedUserName")String updatedUserName,@Param("updatedPassword")String updatedPassword,@Param("minId")Integer minId,@Param("maxId")Integer maxId);

    List<MyUser> findByIdBetweenOrEqualToAndIdLessThan(@Param("minId") Integer minId, @Param("maxId") Integer maxId);


}
