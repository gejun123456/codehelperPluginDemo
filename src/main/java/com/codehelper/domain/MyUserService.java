package com.codehelper.domain;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.codehelper.domain.MyUser;
import com.codehelper.domain.MyUserDao;

@Service
public class MyUserService{

    @Resource
    private MyUserDao myUserDao;

    public int insert(MyUser pojo){
        return myUserDao.insert(pojo);
    }

    public int insertSelective(MyUser pojo){
        return myUserDao.insertSelective(pojo);
    }

    public int insertList(List<MyUser> pojos){
        return myUserDao.insertList(pojos);
    }

    public int update(MyUser pojo){
        return myUserDao.update(pojo);
    }
}
