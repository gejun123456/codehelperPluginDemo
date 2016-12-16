package com.codehelper.mapper;

import base.BaseTest;
import com.codehelper.domain.MyUser;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

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

    @Test
    public void testFind() {
        System.out.println("findByUserName");
        List<MyUser> bruce0 =
                myUserDao.findByUserName("bruce0");
        printToJson(bruce0);


        System.out.println("findFirstByUserName");
        MyUser bruce01 = myUserDao.findFirstByUserName("bruce0");
        printToJson(bruce01);

        System.out.println("findUserNameAndPassWordByIdBetween");
        List<MyUser> userNameAndPasswordByIdBetween = myUserDao.findUserNameAndPasswordByIdBetween(1, 3);
        printToJson(userNameAndPasswordByIdBetween);

        System.out.println("findByIdGreaterThan");
        List<MyUser> byIdGreaterThan = myUserDao.findByIdGreaterThan(9);
        printToJson(byIdGreaterThan);

        System.out.println("findByIdLessThan");
        List<MyUser> byIdLessThan = myUserDao.findByIdLessThan(2);
        printToJson(byIdLessThan);

        System.out.println("findDistinctUserNameIn");
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        List<String> distinctUserNameByIdIn = myUserDao.findDistinctUserNameByIdIn(ids);
        printToJson(distinctUserNameByIdIn);

        System.out.println("findByAgeGreaterThanAndIdLessThan");
        List<MyUser> byAgeGreaterThanAndIdLessThan = myUserDao.findByAgeGreaterThanAndIdLessThan(3, 6);
        printToJson(byAgeGreaterThanAndIdLessThan);

        System.out.println("findByAgeOrderByUserNameDesc");
        List<MyUser> byAgeOrderByUserNameDesc = myUserDao.findByAgeOrderByUserNameDesc(3);
        printToJson(byAgeOrderByUserNameDesc);

    }

    public void testInsertList() throws Exception {

    }

    @Test
    public void testUpdate() throws Exception {
        System.out.println("updateUserNameById");
        int aaaa = myUserDao.updateUserNameById("aaaa", 1);
        System.out.println(aaaa);

        System.out.println("updateUserNameAndPasswordByIdBetween");
        int i = myUserDao.updateUserNameAndPasswordByIdBetween("username", "password", 7, 8);
        System.out.println(i);
    }

    @Test
    public void testDelete(){
        System.out.println("deleteById");
        int i = myUserDao.deleteById(1);
        System.out.println(i);

        System.out.println("deleteByIdBetween");
        int i1 = myUserDao.deleteByIdBetween(1, 3);
        System.out.println(i1);
    }


    @Test
    public void testCount(){
        System.out.println("countByIdBetween");
        Integer integer = myUserDao.countByIdBetween(1, 6);
        System.out.println(integer);

        System.out.println("countDistinctUserNamesByAgeLessThan");
        Integer i = myUserDao.countDistinctUserNameByAgeLessThan(8);
        System.out.println(i);
    }
}