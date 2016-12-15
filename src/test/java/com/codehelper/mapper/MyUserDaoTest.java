package com.codehelper.mapper;

import base.BaseTest;
import com.codehelper.domain.MyUser;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.Calendar;

/**
 * Created by bruce.ge on 2016/12/15.
 */
public class MyUserDaoTest extends BaseTest {

    @Autowired
    private MyUserDao myUserDao;

    @Test
    public void testInsert() throws Exception {
        Calendar cal = Calendar.getInstance();
        for (int i = 0; i < 10; i++) {
            MyUser user = new MyUser();
            user.setUserName("bruce" + i);
            user.setPassword("pass" + i);
            cal.add(Calendar.DAY_OF_YEAR, -1);
            user.setAddTime(cal.getTime());
            user.setAge(i);
            user.setCookie("ejrwwlsswww" + i);
            user.setRemainingAmount(new BigDecimal("100.33").add(new BigDecimal(i)));
            user.setSerialId(1111111111111111111l + i);
            user.setType(i);
            myUserDao.insert(user);
        }
    }

    public void testInsertList() throws Exception {

    }

    public void testUpdate() throws Exception {

    }
}